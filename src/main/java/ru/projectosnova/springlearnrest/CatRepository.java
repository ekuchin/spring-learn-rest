package ru.projectosnova.springlearnrest;

import org.springframework.data.jpa.repository.JpaRepository;

interface CatRepository extends JpaRepository<Cat, Long> {

}

