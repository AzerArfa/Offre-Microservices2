package com.offer.services.admin;

import com.offer.entity.Offer;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface AdminService {

    Offer createOffer(Offer offer);

    List<Offer> getAllOffers();

    Offer updateOffer(Offer offer);

    void deleteOffer(UUID id);
}
