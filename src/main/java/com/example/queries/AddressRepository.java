package com.example.queries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

    List<Address> findByCity(String city);
    List<Address> findByStreetname(String streetname);
    List<Address> findByStreetnameAndCity(String streetname, String city);
    List<Address> findByPostalCodeIsLessThan(int id);
    List<Address> findByCityStartingWith(String start);
    List<Address> findByCityContaining(String containing);
    @Query("select o from Address o where o.streetname=?1 and o.city=?1")
    List<Address> bothSame(String name);

}
