package br.com.dbccompany.vemserSpring.Entity;

import java.io.Serializable;

public abstract class AbstractEntity implements Serializable {

    public abstract Integer getId();

    public abstract void setId(Integer id);

}