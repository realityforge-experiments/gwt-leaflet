package org.gwt.leaflet.client.layers.others;

import org.gwt.leaflet.client.js.JSObject;

/**
 * FeatureGroupImpl implementation class
 * @author Lionel Leiva-Marcon
 *
 */
public class FeatureGroupImpl extends LayerGroupImpl {

	public static native JSObject create(JSObject layers)/*-{				
		return new $wnd.L.featureGroup(layers);
	}-*/;	
	
	public static native  void addPopup(JSObject self, String htmlContent, JSObject options) /*-{
		self.addPopup(htmlContent, options);
	}-*/;

	public static native  JSObject getBounds(JSObject self) /*-{
		return self.getBounds();
	}-*/;
	
	public static native  void setStyle(JSObject self,JSObject options) /*-{
		self.setStyle(options);
	}-*/;
	
	public static native  void bringToFront(JSObject self) /*-{
		self.bringToFront();
	}-*/;
	
	public static native  void bringToBack(JSObject self) /*-{
		self.bringToBack();
	}-*/;
	
	
}
