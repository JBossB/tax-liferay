package com.liferay.tax.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.tax.constants.TaxPortletKeys;
import com.liferay.tax.decorator.ItemShopBasketNoTaxDecorator;
import com.liferay.tax.decorator.ItemShopBasketTaxDecorator;
import com.liferay.tax.decorator.ItemShopBasketTaxImportedDecorator;
import com.liferay.tax.model.ItemShopBasket;
import com.liferay.tax.service.ItemShopBasketLocalServiceUtil;
import com.liferay.tax.util.FunctionsUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author jbaeza
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=jb.tax",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Tax",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TaxPortletKeys.TAX,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user,guest"
	},
	service = Portlet.class
)

public class TaxComponentPortlet extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(this.getClass());
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		int count= ItemShopBasketLocalServiceUtil.getItemShopBasketsCount();
		if(count == 0) {
			System.out.println("NOT DEFAULT DATA EXIST");
			ItemShopBasketLocalServiceUtil.initDefaultData();
		}
		else {
			System.out.println("DEFAULT DATA EXIST");
		}

		super.doView(renderRequest, renderResponse);
	}
	
	public void view(ActionRequest request, ActionResponse response) throws PortalException {
		try {
			long shopBasketId = ParamUtil.getLong(request, "shopBasketId", 1);
			
			System.out.println("view:"+shopBasketId);
			
			List<ItemShopBasket> items = ItemShopBasketLocalServiceUtil.getAll("", shopBasketId);
			String output = "";
			output = printInput(shopBasketId, items);
			output += printOutput(shopBasketId, items);
			
			request.setAttribute("output", output);
			
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		response.setRenderParameter("jspPage", "/view.jsp");
	}
	
	private static String printOutput(long key, List<ItemShopBasket> items) {
		System.out.println("Output "+key+":");
		String output ="Output "+key+":<br>";
		double taxSum = 0D;
		double totalSum = 0D;
		
		for(ItemShopBasket item:items) {
			if(item.isImported()) {
				item = new ItemShopBasketTaxImportedDecorator(item);
				System.out.println("isImported: "+FunctionsUtil.formatDecimal(item.getTotal()));
			}
			if(!item.isExempt()) {
				item = new ItemShopBasketTaxDecorator(item);
				System.out.println("Not isExempt: "+FunctionsUtil.formatDecimal(item.getTotal()));
			}
			if(!item.isImported()&&item.isExempt()) {
				item = new ItemShopBasketNoTaxDecorator(item);
				System.out.println("Not Imported && isExempt: "+FunctionsUtil.formatDecimal(item.getTotal()));
			}
			if(null!=item) {
				taxSum += (item.getTotal()-item.getPrice());
				totalSum += item.getTotal();
				System.out.println(item.getAmount() + " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getTotal()));
				output+=String.valueOf(item.getAmount() + " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getTotal())+"<br>");
			}
			else {
				System.out.println("error");
			}
		}
//		for(ItemShopBasket item:items) {
//			if(item.isImported()) {
//				item.setTotal((item.getTotal()==0D?item.getPrice():item.getTotal()) + getTax(item, feeImported));
//				taxSum += (item.getTotal()-item.getPrice());
//			}
//			else if(!item.isExempt()) {
//				item.setTotal((item.getTotal()==0D?item.getPrice():item.getTotal()) + getTax(item, feeTax));
//				taxSum += (item.getTotal()-item.getPrice());
//			}
//			else {
//				item.setTotal(item.getPrice());
//			}
//			
//			
//			totalSum += item.getTotal();
//			System.out.println(1 + " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getTotal()));
//			output+=String.valueOf(1 + " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getTotal())+"<br>");
//		}
		System.out.println("Sales taxes: "+ FunctionsUtil.formatDecimal(taxSum));
		System.out.println("Total: "+ FunctionsUtil.formatDecimal(totalSum));
		
		output+=String.valueOf("Sales taxes: "+ FunctionsUtil.formatDecimal(taxSum)+"<br>");
		output+=String.valueOf("Total: "+ FunctionsUtil.formatDecimal(totalSum)+"<br>");
		return output;
	}
	
	private static String printInput(long shopBasketId, List<ItemShopBasket> items) {
		System.out.println("Input "+shopBasketId+":");
		String output ="Input "+shopBasketId+":"+"<br>";
		for(ItemShopBasket item:items) {
			System.out.println(item.getAmount()+ " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getPrice()));
			output+=String.valueOf(item.getAmount() + " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getPrice())+"<br>");
		}
		return output;
	}
	
	private static double getTotalPrice(ItemShopBasket item, double fee){
		return FunctionsUtil.roundPrice(item.getPrice() + getTax(item, fee));
	}
	
	private static double getTax(ItemShopBasket item, double fee) {
		return FunctionsUtil.nearest5Percent(item.getPrice() * fee);
	}
	
}