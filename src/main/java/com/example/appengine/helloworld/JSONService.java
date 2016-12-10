package com.example.appengine.helloworld;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;

@Path("/")
public class JSONService {

    @GET
    @Path("/get")
    @Produces("application/json")
    public Product[] getProductInJSON() {

        Product[] products = new Product[2];

        Product product = new Product();
        product.setName("iPad 3");
        product.setQty(999);
        product.setAttributes(new ArrayList<String>() {
            {
                add("tes1");
                add("tes2");
            }
        });

        products[0] = product;
        products[1] = product;

        return products;

    }

    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response createProductInJSON(Product product) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("message", product);

        return Response.status(200).entity(jsonObject).type(MediaType.APPLICATION_JSON_TYPE).build();

    }

    @GET
    @Path("/todo/{varX}/{varY}")
    @Produces("application/json")
    public Product whatEverNameYouLike(@PathParam("varX") String varX, @PathParam("varY") String varY) {
        Product product = new Product();
        product.setName(varX);
        product.setQty(Integer.parseInt(varY));
        return product;
    }
}