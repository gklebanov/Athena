package org.odhsi.athena.dto;

import java.util.List;

/**
 * Created by GMalikov on 20.07.2015.
 */
public class BrowserConceptPagingResultDTO {

    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private List<BrowserConceptTableDTO> data;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<BrowserConceptTableDTO> getData() {
        return data;
    }

    public void setData(List<BrowserConceptTableDTO> data) {
        this.data = data;
    }
}
