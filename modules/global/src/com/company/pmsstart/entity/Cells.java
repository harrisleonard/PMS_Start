package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|block")
@Table(name = "PMSSTART_CELLS")
@Entity(name = "pmsstart$Cells")
public class Cells extends StandardEntity {
    private static final long serialVersionUID = 3894940269793883316L;

    @NotNull
    @Column(name = "BLOCK", nullable = false)
    protected String block;

    @NotNull
    @Column(name = "CELLNUMBER", nullable = false)
    protected String cellnumber;

    public void setBlock(Block block) {
        this.block = block == null ? null : block.getId();
    }

    public Block getBlock() {
        return block == null ? null : Block.fromId(block);
    }

    public void setCellnumber(Cellnumber cellnumber) {
        this.cellnumber = cellnumber == null ? null : cellnumber.getId();
    }

    public Cellnumber getCellnumber() {
        return cellnumber == null ? null : Cellnumber.fromId(cellnumber);
    }


}