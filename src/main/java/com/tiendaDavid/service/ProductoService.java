
package com.tiendaDavid.service;

import com.tiendaDavid.domain.Producto;
import java.util.List;

public interface ProductoService {
    public List<Producto> getProductos(boolean activos);

    public void save(Producto producto);

    public void delete(Producto producto);

    public Producto getProducto(Producto producto);
}
