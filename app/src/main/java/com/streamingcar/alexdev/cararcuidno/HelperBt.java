package com.streamingcar.alexdev.cararcuidno;

public class HelperBt {

    private String address;

    private static HelperBt INSTANCE;

    private HelperBt(){}

    static {
        try {
            INSTANCE = new HelperBt();
        }
        catch (Exception ex)
        {
            throw new RuntimeException("Exception  in creating singleton instance");
        }
    }

    public static HelperBt getInstance()
    {
        return INSTANCE;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
