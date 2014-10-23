/**
 * 
 */
package com.vizuri.vizangular.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vizuri.vizangular.domain.Member;
import com.vizuri.vizangular.services.MemberService;

/**
 * @author amirge
 *
 */

@Path("/members")
public class MemberEndPoint {
   @Inject
   MemberService memberService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listAllMembers")
	public List<Member> getMembers(){
		return memberService.getMembers();						
	}
}
