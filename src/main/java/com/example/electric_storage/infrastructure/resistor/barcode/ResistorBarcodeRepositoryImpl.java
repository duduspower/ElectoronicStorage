package com.example.electric_storage.infrastructure.resistor.barcode;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
class ResistorBarcodeRepositoryImpl implements ResistorBarcodeRepository {

  private final ResistorBarcodeJpaRepository jpaRepository;

  @Override
  public Collection<ResistorBarcodeEntity> getResistorBarcodes() {
    return jpaRepository.findAll();
  }

  @Override
  public Optional<ResistorBarcodeEntity> getResistorBarcodeByUniqueId(String uniqueId) {
    return jpaRepository.findByUniqueId(uniqueId);
  }

  @Override
  public Optional<ResistorBarcodeEntity> getResistorBarcodeByResistorId(String resistorId) {
    return jpaRepository.findByResistorId(resistorId);
  }

  @Override
  public void addResistorBarcode(ResistorBarcodeEntity resistorBarcode) {
    jpaRepository.save(resistorBarcode);
  }
}
