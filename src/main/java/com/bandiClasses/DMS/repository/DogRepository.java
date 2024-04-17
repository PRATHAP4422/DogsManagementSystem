package com.bandiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;
/**
*
* @author Saiprathap reddy
*/
public interface DogRepository extends CrudRepository<Dog,Integer> {

}
