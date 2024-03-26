package com.mibanco.clientecdtdigital.es.services.contract;

import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalType;
import com.mibanco.clientecdtdigital.es.gen.type.ClienteCDTDigitalTypeResponse;
import jakarta.transaction.Transactional;

public interface IClienteCDTDigital {
    @Transactional
    public ClienteCDTDigitalType crearClienteCdtDigital(ClienteCDTDigitalType clienteCDTDigitalType);
    @Transactional
    public ClienteCDTDigitalTypeResponse actualizarClienteCDTDigital(Long id, ClienteCDTDigitalTypeResponse clienteCDTDigitalTypeResponse);

}
