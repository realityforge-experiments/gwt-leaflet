package org.gwt.leaflet.client.layers.others;

import org.gwt.leaflet.client.js.JSObject;
import org.gwt.leaflet.client.layers.ILayerImpl;

/**
 * {@link LayerGroup} implementation class
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class LayerGroupImpl extends ILayerImpl {

	public static native JSObject create(JSObject layers)/*-{				
		return new $wnd.L.layerGroup(layers);
	}-*/;	
	
	public static native  void addLayer(JSObject self, JSObject layer) /*-{
		self.addLayer(layer);
	}-*/;

	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;

}
