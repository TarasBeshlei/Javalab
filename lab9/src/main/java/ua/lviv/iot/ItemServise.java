package ua.lviv.iot;

import ua.lviv.iot.item.ShopItem;
import ua.lviv.iot.item.equipment.Boer;
import ua.lviv.iot.persistance.dao.ItemDao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/shopItems")
public class ItemServise implements Serializable {

    private static final long serialVersionUID = 1L;



    @Inject
    private ItemDao dao;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ShopItem getGoods(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createGood(final ShopItem shopItem) {
        dao.update(shopItem);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteGood(final @PathParam("id") Integer id) {
        dao.remove(id);
        return Response.status(200).entity("Good").build();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response replaceGood(final ShopItem shopItem) {
        dao.persist(shopItem);
        return Response.status(200).entity("Good").build();
    }



//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public final Response getGoodsList(){
//        return  Response.status(200).entity(shopItemMap.values()).build();
//    }

}

