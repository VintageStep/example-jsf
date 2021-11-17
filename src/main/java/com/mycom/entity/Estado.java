package com.mycom.entity;

public enum Estado {
	ACTIVO,
	INACTIVO;
	
    public String lowerCase() {
        return this.name().toLowerCase();
    }

	
}
