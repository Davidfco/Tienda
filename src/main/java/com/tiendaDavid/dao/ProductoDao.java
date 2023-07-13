
package com.tiendaDavid.dao;

import com.tiendaDavid.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto,Long>  {
    
}
