package Service;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import Entity.Calculation;


@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/calc")

public class MyService {
	
		@PersistenceContext(unitName="task1")
		private EntityManager em;
	
		@POST
		public String doCalculation(Calculation obj)
		{
			
			int result = 0;
			em.persist(obj);
			
			if(obj.getOperation()=='+')
			{
				result =obj.getNumber1()+obj.getNumber2();
				
			}
			
			else if(obj.getOperation()=='-')
			{
				result =obj.getNumber1()-obj.getNumber2();
				
				
			}
			
			else if(obj.getOperation()=='*')
			{
				result =obj.getNumber1()*obj.getNumber2();
			
			
			}
			
			else if(obj.getOperation()=='/')
			{
				result =obj.getNumber1()/obj.getNumber2();
				
			}
			
			return "Result:" + result;
		}
		
		@GET
		public List<Calculation> get()
		{	
			TypedQuery<Calculation> q = em.createQuery("SELECT c FROM Calculation c", Calculation.class);
            return q.getResultList();
		}
		
		
		/*@POST
		public String Create(Calculation c) {
			
			return doCalculation(c);
			
		}*/
		
		
		/*@GET
		public List<Calculation> getCalculation()
		{	
            return get();
		}*/
		
		
		
		
		
}



