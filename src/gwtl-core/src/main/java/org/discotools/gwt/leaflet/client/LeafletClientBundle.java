package org.discotools.gwt.leaflet.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletClientBundle
  extends ClientBundle {

//    @Source("leaflet-src.js")
    @Source("leaflet.js")
    TextResource baseScript();

    @Source("leaflet.css")
    @CssResource.NotStrict
    CssResource css();

    @Source("images/layers.png")
    ImageResource layers();
}
