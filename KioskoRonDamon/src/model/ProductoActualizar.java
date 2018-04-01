package model;

public class ProductoActualizar {
    private int id; /*id del producto a actualizar*/
    private int stockActual; /*stock actual del producto*/
    private int cantMenos; /*cantidad de unidades que se venderan del producto*/

    public ProductoActualizar(int id, int stockActual, int cantMenos) {
        this.id = id;
        this.stockActual = stockActual;
        this.cantMenos = cantMenos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getCantMenos() {
        return cantMenos;
    }

    public void setCantMenos(int cantMenos) {
        this.cantMenos = cantMenos;
    }
}
