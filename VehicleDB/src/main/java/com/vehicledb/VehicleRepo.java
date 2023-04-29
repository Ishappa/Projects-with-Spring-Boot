package com.vehicledb;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepo extends CrudRepository<Vehicle, Integer>{

	List <Vehicle>findByVcolor(String vcolor);
	@Query(value="select* from vehicle where vyear>2022",nativeQuery = true)
	List<Vehicle> VeihcleAfterTwenty();
}
