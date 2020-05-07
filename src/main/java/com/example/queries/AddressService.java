package com.example.queries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;
    private static final Logger log = LoggerFactory.getLogger(AddressService.class);

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    void search() {
        List<Address> result = addressRepository.findByCity("Solna");
        log.info("findByCity " + result);
        result = addressRepository.findByStreetname("Södervägen");
        log.info("findByStreet" + result);
        result = addressRepository.findByStreetnameAndCity("Solna","Södervägen");
        log.info("findByStreetnameAndCity" + result);
        result = addressRepository.findByPostalCodeIsLessThan(456);
        log.info("findByPostalCodeIsLessThan" + result);
        result = addressRepository.findByPostalCodeIsLessThan(456);
        log.info("findByPostalCodeIsLessThan" + result);
        result = addressRepository.findByCityStartingWith("S");
        log.info("findByCityStartingWith" + result);
        result = addressRepository.findByCityContaining("l");
        log.info("findByCityContaining" + result);
        result = addressRepository.bothSame("Halmstad");
        log.info("bothSame" + result);
    }
}
