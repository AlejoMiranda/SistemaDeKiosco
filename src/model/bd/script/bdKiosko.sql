CREATE DATABASE bdKiosko;

USE bdKiosko;

CREATE TABLE login( 
    id INT AUTO_INCREMENT,
    nombre VARCHAR (20),
    contrasena VARCHAR (20),
    PRIMARY KEY (id)
);

CREATE TABLE kiosko(
    id INT AUTO_INCREMENT,
    nombreDueño VARCHAR (20),
    nombreKIosko VARCHAR (20),
    costePatente INT,
    idLoginFK INT,
    PRIMARY KEY (id),
    FOREIGN KEY (idLoginFK) REFERENCES login(id)
);

CREATE TABLE tipoProducto(
    id INT AUTO_INCREMENT,
    nombre VARCHAR (20),
    PRIMARY KEY (id)
);

CREATE TABLE producto(
    id INT AUTO_INCREMENT,
    nombre VARCHAR (20),
    costeDeCompra INT,
    costeDeVenta INT,
    cantidad INT,
    idTipoProductoFK INT,
    PRIMARY KEY (id),
    FOREIGN KEY (idTipoProductoFK) REFERENCES tipoProducto(id)
);

CREATE TABLE proveedor(
    id INT AUTO_INCREMENT,
    nombre VARCHAR (20),
    idProductoFK INT,
    PRIMARY KEY (id),
    FOREIGN KEY (idProductoFK) REFERENCES producto(id)
);

CREATE TABLE historicoVenta(
    id INT AUTO_INCREMENT,
    venta INT,
    fecha date,
    cantidad INT,
    idProductoFK INT,
    PRIMARY KEY (id),
    FOREIGN KEY (idProductoFK) REFERENCES producto(id)
);
