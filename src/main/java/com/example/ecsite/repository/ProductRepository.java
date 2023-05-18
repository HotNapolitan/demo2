package com.example.ecsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecsite.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	// 追加のクエリメソッドを定義
}
