package com.example.rbcdemo.repo;

import com.example.rbcdemo.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice, Long> {


}
