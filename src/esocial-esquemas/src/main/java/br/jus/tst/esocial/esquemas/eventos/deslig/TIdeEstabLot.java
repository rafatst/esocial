//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.05 at 06:37:51 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.deslig;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_ideEstabLot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_ideEstabLot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_tpInsc_EstabLot"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrInsc_EstabLot"/>
 *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codLotacao"/>
 *         &lt;element name="detVerbas" maxOccurs="200">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
 *                   &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_ideTabRubr"/>
 *                   &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_qtdRubr" minOccurs="0"/>
 *                   &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_fator" minOccurs="0"/>
 *                   &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_vrRubr"/>
 *                   &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_indApurIR" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoAgNocivo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_grauExp"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoSimples" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEstabLot", propOrder = {
    "tpInsc",
    "nrInsc",
    "codLotacao",
    "detVerbas",
    "infoAgNocivo",
    "infoSimples"
})
public class TIdeEstabLot {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    @XmlElement(required = true)
    protected String codLotacao;
    @XmlElement(required = true)
    protected List<TIdeEstabLot.DetVerbas> detVerbas;
    protected TIdeEstabLot.InfoAgNocivo infoAgNocivo;
    protected TInfoSimples infoSimples;

    /**
     * Gets the value of the tpInsc property.
     * 
     */
    public byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Sets the value of the tpInsc property.
     * 
     */
    public void setTpInsc(byte value) {
        this.tpInsc = value;
    }

    /**
     * Gets the value of the nrInsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Sets the value of the nrInsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

    /**
     * Gets the value of the codLotacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLotacao() {
        return codLotacao;
    }

    /**
     * Sets the value of the codLotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLotacao(String value) {
        this.codLotacao = value;
    }

    /**
     * Gets the value of the detVerbas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detVerbas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetVerbas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIdeEstabLot.DetVerbas }
     * 
     * 
     */
    public List<TIdeEstabLot.DetVerbas> getDetVerbas() {
        if (detVerbas == null) {
            detVerbas = new ArrayList<TIdeEstabLot.DetVerbas>();
        }
        return this.detVerbas;
    }

    /**
     * Gets the value of the infoAgNocivo property.
     * 
     * @return
     *     possible object is
     *     {@link TIdeEstabLot.InfoAgNocivo }
     *     
     */
    public TIdeEstabLot.InfoAgNocivo getInfoAgNocivo() {
        return infoAgNocivo;
    }

    /**
     * Sets the value of the infoAgNocivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIdeEstabLot.InfoAgNocivo }
     *     
     */
    public void setInfoAgNocivo(TIdeEstabLot.InfoAgNocivo value) {
        this.infoAgNocivo = value;
    }

    /**
     * Gets the value of the infoSimples property.
     * 
     * @return
     *     possible object is
     *     {@link TInfoSimples }
     *     
     */
    public TInfoSimples getInfoSimples() {
        return infoSimples;
    }

    /**
     * Sets the value of the infoSimples property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoSimples }
     *     
     */
    public void setInfoSimples(TInfoSimples value) {
        this.infoSimples = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
     *         &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_ideTabRubr"/>
     *         &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_qtdRubr" minOccurs="0"/>
     *         &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_fator" minOccurs="0"/>
     *         &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_vrRubr"/>
     *         &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_indApurIR" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codRubr",
        "ideTabRubr",
        "qtdRubr",
        "fatorRubr",
        "vrRubr",
        "indApurIR"
    })
    public static class DetVerbas {

        @XmlElement(required = true)
        protected String codRubr;
        @XmlElement(required = true)
        protected String ideTabRubr;
        protected BigDecimal qtdRubr;
        protected BigDecimal fatorRubr;
        @XmlElement(required = true)
        protected BigDecimal vrRubr;
        protected Byte indApurIR;

        /**
         * Gets the value of the codRubr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodRubr() {
            return codRubr;
        }

        /**
         * Sets the value of the codRubr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodRubr(String value) {
            this.codRubr = value;
        }

        /**
         * Gets the value of the ideTabRubr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeTabRubr() {
            return ideTabRubr;
        }

        /**
         * Sets the value of the ideTabRubr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeTabRubr(String value) {
            this.ideTabRubr = value;
        }

        /**
         * Gets the value of the qtdRubr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQtdRubr() {
            return qtdRubr;
        }

        /**
         * Sets the value of the qtdRubr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQtdRubr(BigDecimal value) {
            this.qtdRubr = value;
        }

        /**
         * Gets the value of the fatorRubr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFatorRubr() {
            return fatorRubr;
        }

        /**
         * Sets the value of the fatorRubr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFatorRubr(BigDecimal value) {
            this.fatorRubr = value;
        }

        /**
         * Gets the value of the vrRubr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrRubr() {
            return vrRubr;
        }

        /**
         * Sets the value of the vrRubr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrRubr(BigDecimal value) {
            this.vrRubr = value;
        }

        /**
         * Gets the value of the indApurIR property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getIndApurIR() {
            return indApurIR;
        }

        /**
         * Sets the value of the indApurIR property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setIndApurIR(Byte value) {
            this.indApurIR = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_grauExp"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "grauExp"
    })
    public static class InfoAgNocivo {

        protected byte grauExp;

        /**
         * Gets the value of the grauExp property.
         * 
         */
        public byte getGrauExp() {
            return grauExp;
        }

        /**
         * Sets the value of the grauExp property.
         * 
         */
        public void setGrauExp(byte value) {
            this.grauExp = value;
        }

    }

}
