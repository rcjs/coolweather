package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 正经 on 2017/1/22.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinecId;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinecId() {
        return provinecId;
    }

    public void setProvinecId(int provinecId) {
        this.provinecId = provinecId;
    }
}
