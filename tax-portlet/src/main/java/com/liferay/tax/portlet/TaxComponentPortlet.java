package com.liferay.tax.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.tax.constants.TaxPortletKeys;
import com.liferay.tax.model.ItemShopBasket;
import com.liferay.tax.service.ItemShopBasketLocalServiceUtil;
import com.liferay.tax.util.FunctionsUtil;

import java.io.IOException;
import java.util.ArrayList;
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
	
	public void buscar(ActionRequest request, ActionResponse response) throws PortalException {
		try {
			long shopBasketId = ParamUtil.getLong(request, "shopBasketId", 1);
			
			System.out.println("buscar:"+shopBasketId);
			
			List<ItemShopBasket> items = ItemShopBasketLocalServiceUtil.getAll("", shopBasketId);
			printInput(shopBasketId, items);
			printOutput(shopBasketId, items);
			List listaInput = new ArrayList();
			List listaOutput = new ArrayList();
			request.setAttribute("listaInput", listaInput);
			request.setAttribute("listaOutput", listaOutput);
			
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		response.setRenderParameter("jspPage", "/view.jsp");
	}
	
	private static void printOutput(long key, List<ItemShopBasket> items) {
		System.out.println("Output "+key+":");
		
		double taxSum = 0D;
		double totalSum = 0D;
		double feeImported = 0.05;
		double feeTax = 0.10;
		for(ItemShopBasket item:items) {
			if(item.isIsImported()) {
				item.setTotal(getTotalPrice(item, feeImported));
			}
			if(!item.isIsExempt()) {
				item.setTotal(getTotalPrice(item, feeTax));
			}
			
			taxSum += (item.getTotal()-item.getPrice());
			totalSum += item.getTotal();
			System.out.println(item.getAmount() + " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getTotal()));
		}
		System.out.println("Sales taxes: "+ FunctionsUtil.formatDecimal(taxSum));
		System.out.println("Total: "+ FunctionsUtil.formatDecimal(totalSum));
	}
	
	private static void printInput(long shopBasketId, List<ItemShopBasket> items) {
		System.out.println("Input "+shopBasketId+":");
		for(ItemShopBasket item:items) {
			System.out.println(1+ " " + item.getName() + " at " + FunctionsUtil.formatDecimal(item.getPrice()));
		}
	}
	
	private static double getTotalPrice(ItemShopBasket item, double fee){
		return FunctionsUtil.roundPrice(item.getPrice() + getTax(item, fee));
	}
	
	private static double getTax(ItemShopBasket item, double fee) {
		return FunctionsUtil.nearest5Percent(item.getPrice() * fee);
	}
	
}