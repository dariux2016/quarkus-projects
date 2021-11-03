package com.dariux2016.crud.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dariux2016.crud.model.Item;
import com.dariux2016.crud.service.ItemService;

@Path("items")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemResource {
	
	@Inject
	ItemService itemService;

	@GET
	public List<Item> get(){
		return itemService.get();
	}
	
	@POST
	public void create(Item item){
		itemService.create(item);
	}
	
	@PUT
	public void update(Item item){
		itemService.update(item);
	}
	
	@DELETE
	@Path("{id}")
	public void delete(@PathParam("id") Long id){
		itemService.delete(id);
	}
}