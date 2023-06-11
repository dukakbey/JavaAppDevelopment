package org.csystem.util.string;

public class ResultInfo {

    public ResultInfo(int id, String m_text, String m_expected) {
        this.id = id;
        this.m_text = m_text;
        this.m_expected = m_expected;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getM_text() {
        return m_text;
    }

    public void setM_text(String m_text) {
        this.m_text = m_text;
    }

    public String getM_expected() {
        return m_expected;
    }

    public void setM_expected(String m_expected) {
        this.m_expected = m_expected;
    }

    private int id;
    private String m_text;
    private String m_expected;
}
