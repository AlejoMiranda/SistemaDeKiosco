CREATE DATABASE bdKioskoRD;

USE bdKioskoRD;

CREATE TABLE usuario( 
    id INT AUTO_INCREMENT,
    nombre VARCHAR (50),
    apellido VARCHAR (50),
    contrasena VARCHAR (50),
    PRIMARY KEY (id)
);

CREATE TABLE almacen( 
    id INT AUTO_INCREMENT,
    nombre VARCHAR (50),
    nombrePropietario VARCHAR (50),
    direccion VARCHAR (50),
    idUsuarioFK INT,
    PRIMARY KEY (id),
    FOREIGN KEY (idUsuarioFK) REFERENCES usuario(id)
);

CREATE TABLE tipoProducto(
    id INT AUTO_INCREMENT,
    descripcion VARCHAR (20),
    PRIMARY KEY (id)
);

CREATE TABLE proveedor(
    id INT AUTO_INCREMENT,
    rut VARCHAR(20),
    nombre VARCHAR(20),
    telefono VARCHAR(15),
    direccion VARCHAR(40),
    PRIMARY KEY (id)
);

CREATE TABLE producto(
    id INT AUTO_INCREMENT,
    nombre VARCHAR (20),
    stock INT, /* inventario */
    descripcion VARCHAR(100),
    precioVenta INT, /* precio venta */
    precioCompra INT,
    idTipoProductoFK INT,
    idProveedorFK INT,
    PRIMARY KEY (id),
    FOREIGN KEY (idTipoProductoFK) REFERENCES tipoProducto(id),
    FOREIGN KEY (idProveedorFK) REFERENCES proveedor(id)
);

CREATE TABLE venta(
    id INT AUTO_INCREMENT,
    fecha DATE,
    total INT,
    PRIMARY KEY (id)
);

INSERT INTO usuario VALUES (null,'Ramón','López','ramon1969');

INSERT INTO almacen VALUES (null,'Kiosco Ron Damón','Ramón López','Av Kennedy #19',1);

INSERT INTO tipoProducto VALUES (null, "Comestible");
INSERT INTO tipoProducto VALUES (null, "Bebestible");
INSERT INTO tipoProducto VALUES (null, "Entretenimiento");

INSERT INTO proveedor VALUES (null,'96838800-2','Coca-Cola Company','722561382','Av Del Mar #12');
INSERT INTO proveedor VALUES (null,'92113300-9','Fruna','722561872','Calle Camilo Henríquez #281');
INSERT INTO proveedor VALUES (null,'90138219-6','Hot Wheels','722561234','Baquedano #635');

INSERT INTO producto VALUES (null,'Bebida Coca-Cola',100,'Gaseosa de 100 ml',350,300,1,1);
INSERT INTO producto VALUES (null,'Galleta Serranita',120,'Galleta Rellena con Crema',150,100,2,2);
INSERT INTO producto VALUES (null,'Batimovil',20,'Auto de colección de la famosa serie Batman',23990,18990,3,3);

INSERT INTO venta VALUES (null,'2018/02/21',23990);
INSERT INTO venta VALUES (null,'2018/01/05',1200);
INSERT INTO venta VALUES (null,now(),23990);

-- DROP DATABASE bdKioskoRD;

SELECT * FROM venta WHERE fecha BETWEEN '2018/01/01' AND '2018/02/25' 
SELECT * FROM proveedor WHERE id = 1;

SELECT date_format(venta.fecha,'%d/%m/%Y') AS modified_date FROM bdKioskoRD.venta;


UPDATE producto SET stock = 100 WHERE id = 4;

SELECT * FROM producto;