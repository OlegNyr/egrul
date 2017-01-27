
package ru.nyrk.egrul.generate.egrul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="СвНаимЮЛ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="НаимЮЛПолн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимЮЛСокр">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="500"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвАдресЮЛ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="АдресРФ" type="{}АдрРФЕГРЮЛТип"/>
 *                   &lt;element name="СведОтсутАдресЮЛ" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="РешСудНедАдр" type="{}РешСудТип" minOccurs="0"/>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ПризнОтсутАдресЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                                 &lt;enumeration value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвАдрЭлПочты" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="E-mail" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="45"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвОбрЮЛ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СпОбрЮЛ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодСпОбрЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСпОбрЮЛ">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="5"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                 &lt;attribute name="ДатаОГРН" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="РегНом">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаРег">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимРО">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРегОрг">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="КодНО" use="required" type="{}СОНОТип" />
 *                 &lt;attribute name="НаимНО" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="10"/>
 *                       &lt;maxLength value="250"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="АдрРО">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="10"/>
 *                       &lt;maxLength value="128"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвСтатус" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвСтатус">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодСтатусЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСтатусЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="5"/>
 *                                 &lt;maxLength value="500"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвРешИсклЮЛ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ДатаРеш" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НомерРеш" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ДатаПубликации" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;minInclusive value="2005-07-06"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НомерЖурнала">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="50"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвПрекрЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СпПрекрЮЛ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодСпПрекрЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСпПрекрЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="5"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвРегОрг" type="{}СвРегОргТип"/>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаПрекрЮЛ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвУчетНО" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвНО" type="{}СвНОТип"/>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИНН" use="required" type="{}ИННЮЛТип" />
 *                 &lt;attribute name="КПП" use="required" type="{}КППТип" />
 *                 &lt;attribute name="ДатаПостУч" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРегПФ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвОргПФ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодПФ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="3"/>
 *                                 &lt;maxLength value="6"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимПФ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="10"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="РегНомПФ" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="15"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаРег" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРегФСС" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвОргФСС">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодФСС" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="4"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимФСС" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="10"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="РегНомФСС" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="15"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаРег" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвУстКап" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ДоляРубля" type="{}ДробьТип" minOccurs="0"/>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СведУмУК" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ВелУмУК" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;totalDigits value="19"/>
 *                                 &lt;fractionDigits value="4"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ДатаРеш" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="НаимВидКап" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="10"/>
 *                       &lt;maxLength value="20"/>
 *                       &lt;enumeration value="УСТАВНЫЙ КАПИТАЛ"/>
 *                       &lt;enumeration value="СКЛАДОЧНЫЙ КАПИТАЛ"/>
 *                       &lt;enumeration value="УСТАВНЫЙ ФОНД"/>
 *                       &lt;enumeration value="ПАЕВЫЕ ВЗНОСЫ"/>
 *                       &lt;enumeration value="ПАЕВОЙ ФОНД"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="СумКап" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;totalDigits value="19"/>
 *                       &lt;fractionDigits value="4"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвУпрОрг" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                   &lt;element name="СвРегИн" type="{}СвРегИнЮЛЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвПредЮЛ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="НаимПредЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвАдрРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *                   &lt;element name="ПредИнЮЛ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                             &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *                             &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СведДолжнФЛ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                   &lt;element name="СвДолжн">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ОГРНИП" type="{}ОГРНИПТип" />
 *                           &lt;attribute name="ВидДолжн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимВидДолжн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="5"/>
 *                                 &lt;maxLength value="100"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимДолжн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="255"/>
 *                                 &lt;minLength value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *                   &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                   &lt;element name="СвДискв" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ДатаНачДискв" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="ДатаОкончДискв" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="ДатаРеш" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвУчредит" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="УчрЮЛРос" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                             &lt;element name="СвРегСтарые" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                       &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="РегНом">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ДатаРег">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="НаимРО">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="УчрЮЛИн" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                             &lt;element name="СвРегИн" type="{}СвРегИнЮЛЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="УчрФЛ" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                             &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="СвДовУпрЮЛ" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;element name="НаимИННДовУпр" type="{}СвЮЛЕГРЮЛТип"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвДовУпрФЛ" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                                       &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ЛицоУпрНасл" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                                       &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ДатаОткрНасл" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="УчрРФСубМО" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="ВидНаимУчр">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="КодУчрРФСубМО" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="1"/>
 *                                           &lt;enumeration value="2"/>
 *                                           &lt;enumeration value="3"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="НаимМО">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="255"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="КодРегион" type="{}CCРФТип" />
 *                                     &lt;attribute name="НаимРегион">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="100"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="СвОргОсущПр" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвФЛОсущПр" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                                       &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="УчрПИФ" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="СвНаимПИФ">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                       &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="НаимПИФ" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="1000"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвУпрКомпПИФ">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;element name="УпрКомпПиф" type="{}СвЮЛЕГРЮЛТип"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвДоляООО" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *         &lt;element name="СвДержРеестрАО" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="ДержРеестрАО" type="{}СвЮЛЕГРЮЛТип"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвОКВЭД" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвОКВЭДОсн" type="{}СвОКВЭДТип" minOccurs="0"/>
 *                   &lt;element name="СвОКВЭДДоп" type="{}СвОКВЭДТип" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвЛицензия" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="НаимЛицВидДеят" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="МестоДейстЛиц" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="5"/>
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ЛицОргВыдЛиц" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвПриостЛиц" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ДатаПриостЛиц" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ЛицОргПриостЛиц" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="10"/>
 *                                 &lt;maxLength value="500"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="СерЛиц">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="10"/>
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НомЛиц" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="100"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ВидЛиц">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="10"/>
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаЛиц" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ДатаНачЛиц" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ДатаОкончЛиц" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвПодразд" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвФилиал" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="СвНаим" type="{}СвНаимПодраздТип" minOccurs="0"/>
 *                             &lt;element name="АдрМНРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдрМНИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="СвУчетНОФилиал" type="{}СвУчетНОПодраздТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвПредстав" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="СвНаим" type="{}СвНаимПодраздТип" minOccurs="0"/>
 *                             &lt;element name="АдрМНРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="АдрМНИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                             &lt;element name="СвУчетНОПредстав" type="{}СвУчетНОПодраздТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРеорг" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвСтатус">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодСтатусЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСтатусЮЛ" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="5"/>
 *                                 &lt;maxLength value="500"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИзмСостРеоргЮЛ" type="{}ГРНДатаТип" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="СвРеоргЮЛ" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                           &lt;attribute name="ИНН" use="required" type="{}ИННЮЛТип" />
 *                           &lt;attribute name="НаимЮЛПолн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="СостЮЛпосле">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="30"/>
 *                                 &lt;maxLength value="50"/>
 *                                 &lt;enumeration value="ПРЕКРАТИТ ДЕЯТЕЛЬНОСТЬ ПОСЛЕ РЕОРГАНИЗАЦИИ"/>
 *                                 &lt;enumeration value="ПРОДОЛЖИТ ДЕЯТЕЛЬНОСТЬ ПОСЛЕ РЕОРГАНИЗАЦИИ"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвПредш" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвЮЛсложнРеорг" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                           &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                           &lt;attribute name="НаимЮЛПолн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                 &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                 &lt;attribute name="НаимЮЛПолн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвКФХПредш" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ОГРНИП" use="required" type="{}ОГРНИПТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвПреем" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвЮЛсложнРеорг" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                           &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                           &lt;attribute name="НаимЮЛПолн" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                 &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                 &lt;attribute name="НаимЮЛПолн" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвКФХПреем" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ОГРНИП" use="required" type="{}ОГРНИПТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвЗапЕГРЮЛ" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ВидЗап" type="{}ВидЗапТип"/>
 *                   &lt;element name="СвРегОрг" type="{}СвРегОргТип"/>
 *                   &lt;element name="СвЗаявФЛ" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ВидЗаяв">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="КодСЗОЮЛ" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="2"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="НаимСЗОЮЛ" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="500"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвЮЛ" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                                     &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                                     &lt;attribute name="НаимЮЛПолн" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="1000"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвУпрОрг" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                                     &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                                     &lt;attribute name="НаимЮЛПолн" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="1000"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СвФЛ">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="СвФИОИНН">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Фамилия">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="60"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Имя">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="60"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Отчество">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="60"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СвРожд" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                               &lt;attribute name="МестоРожд" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ПрДатаРожд">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="1"/>
 *                                                     &lt;enumeration value="1"/>
 *                                                     &lt;enumeration value="2"/>
 *                                                     &lt;enumeration value="3"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="УдЛичнФЛ" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="КодВидДок" use="required" type="{}СПДУЛТип" />
 *                                               &lt;attribute name="НаимДок" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="100"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="СерНомДок" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="50"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                               &lt;attribute name="ВыдДок">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="КодВыдДок">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="7"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="АдресМЖРФ" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Регион" type="{}РегионТип"/>
 *                                                 &lt;element name="Район" type="{}РайонТип" minOccurs="0"/>
 *                                                 &lt;element name="Город" type="{}ГородТип" minOccurs="0"/>
 *                                                 &lt;element name="НаселПункт" type="{}НаселПунктТип" minOccurs="0"/>
 *                                                 &lt;element name="Улица" type="{}УлицаТип" minOccurs="0"/>
 *                                                 &lt;element name="ГРНДата" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                 &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Индекс">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="6"/>
 *                                                     &lt;pattern value="[0-9]{6}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="КодРегион" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{}CCРФТип">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="КодАдрКладр">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="11"/>
 *                                                     &lt;maxLength value="19"/>
 *                                                     &lt;pattern value="[0-9]{11}"/>
 *                                                     &lt;pattern value="[0-9]{15}"/>
 *                                                     &lt;pattern value="[0-9]{19}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Дом">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="50"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Корпус">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="50"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="Кварт">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="50"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="АдрМЖИн" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="ОКСМ" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{}ОКСМТип">
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="НаимСтран" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="250"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="АдрИн">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="255"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СведПредДок" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="НаимДок">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="НомДок" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="50"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ДатаДок" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                   &lt;minInclusive value="1900-01-01"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвСвид" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаСвидНед" type="{}ГРНДатаТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Серия" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Номер" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="7"/>
 *                                 &lt;maxLength value="9"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ДатаВыдСвид" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ГРНДатаИспрПред" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="ГРНДатаНедПред" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *                   &lt;element name="СвСтатусЗап" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ГРНДатаНед" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *                             &lt;element name="ГРНДатаИспр" type="{}ИдГРНДатаТип" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдЗап" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ГРН" type="{}ОГРНТип" />
 *                 &lt;attribute name="ДатаЗап" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаВып" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *       &lt;attribute name="ДатаОГРН" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *       &lt;attribute name="КПП" type="{}КППТип" />
 *       &lt;attribute name="СпрОПФ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="4"/>
 *             &lt;maxLength value="5"/>
 *             &lt;enumeration value="ОКОПФ"/>
 *             &lt;enumeration value="КОПФ"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодОПФ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="2"/>
 *             &lt;maxLength value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ПолнНаимОПФ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="4"/>
 *             &lt;maxLength value="255"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "infoNameUl",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u042e\u041b",
    "\u0441\u0432\u0410\u0434\u0440\u042d\u043b\u041f\u043e\u0447\u0442\u044b",
    "\u0441\u0432\u041e\u0431\u0440\u042e\u041b",
    "\u0441\u0432\u0420\u0435\u0433\u041e\u0440\u0433",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441",
    "\u0441\u0432\u041f\u0440\u0435\u043a\u0440\u042e\u041b",
    "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e",
    "\u0441\u0432\u0420\u0435\u0433\u041f\u0424",
    "\u0441\u0432\u0420\u0435\u0433\u0424\u0421\u0421",
    "\u0441\u0432\u0423\u0441\u0442\u041a\u0430\u043f",
    "infoUprOrganDoc",
    "\u0441\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b",
    "\u0441\u0432\u0423\u0447\u0440\u0435\u0434\u0438\u0442",
    "\u0441\u0432\u0414\u043e\u043b\u044f\u041e\u041e\u041e",
    "\u0441\u0432\u0414\u0435\u0440\u0436\u0420\u0435\u0435\u0441\u0442\u0440\u0410\u041e",
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414",
    "\u0441\u0432\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f",
    "\u0441\u0432\u041f\u043e\u0434\u0440\u0430\u0437\u0434",
    "\u0441\u0432\u0420\u0435\u043e\u0440\u0433",
    "\u0441\u0432\u041f\u0440\u0435\u0434\u0448",
    "\u0441\u0432\u041a\u0424\u0425\u041f\u0440\u0435\u0434\u0448",
    "\u0441\u0432\u041f\u0440\u0435\u0435\u043c",
    "\u0441\u0432\u041a\u0424\u0425\u041f\u0440\u0435\u0435\u043c",
    "\u0441\u0432\u0417\u0430\u043f\u0415\u0413\u0420\u042e\u041b"
})
public class SvUl {

    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b", required = true)
    protected DocInfoNameUl infoNameUl;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441\u042e\u041b", required = true)
    protected СвАдресЮЛ свАдресЮЛ;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u042d\u043b\u041f\u043e\u0447\u0442\u044b")
    protected СвАдрЭлПочты свАдрЭлПочты;
    @XmlElement(name = "\u0421\u0432\u041e\u0431\u0440\u042e\u041b", required = true)
    protected СвОбрЮЛ свОбрЮЛ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433", required = true)
    protected СвРегОрг свРегОрг;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441")
    protected List<DocInfoStatus> свСтатус;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u043a\u0440\u042e\u041b")
    protected СвПрекрЮЛ свПрекрЮЛ;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
    protected СвУчетНО свУчетНО;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041f\u0424")
    protected СвРегПФ свРегПФ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
    protected СвРегФСС свРегФСС;
    @XmlElement(name = "\u0421\u0432\u0423\u0441\u0442\u041a\u0430\u043f")
    protected СвУстКап свУстКап;
    @XmlElement(name = "\u0421\u0432\u0423\u043f\u0440\u041e\u0440\u0433")
    protected List<InfoUprOrganDoc> infoUprOrganDoc;
    @XmlElement(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b")
    protected List<СведДолжнФЛ> сведДолжнФЛ;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0440\u0435\u0434\u0438\u0442")
    protected СвУчредит свУчредит;
    @XmlElement(name = "\u0421\u0432\u0414\u043e\u043b\u044f\u041e\u041e\u041e")
    protected ShareCapitalEGRULType свДоляООО;
    @XmlElement(name = "\u0421\u0432\u0414\u0435\u0440\u0436\u0420\u0435\u0435\u0441\u0442\u0440\u0410\u041e")
    protected СвДержРеестрАО свДержРеестрАО;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
    protected СвОКВЭД свОКВЭД;
    @XmlElement(name = "\u0421\u0432\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f")
    protected List<СвЛицензия> свЛицензия;
    @XmlElement(name = "\u0421\u0432\u041f\u043e\u0434\u0440\u0430\u0437\u0434")
    protected СвПодразд свПодразд;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u043e\u0440\u0433")
    protected List<СвРеорг> свРеорг;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u0434\u0448")
    protected List<СвПредш> свПредш;
    @XmlElement(name = "\u0421\u0432\u041a\u0424\u0425\u041f\u0440\u0435\u0434\u0448")
    protected List<СвКФХПредш> свКФХПредш;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u0435\u043c")
    protected List<СвПреем> свПреем;
    @XmlElement(name = "\u0421\u0432\u041a\u0424\u0425\u041f\u0440\u0435\u0435\u043c")
    protected СвКФХПреем свКФХПреем;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043f\u0415\u0413\u0420\u042e\u041b", required = true)
    protected List<СвЗапЕГРЮЛ> свЗапЕГРЮЛ;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u044b\u043f", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date датаВып;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d", required = true)
    protected String огрн;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0413\u0420\u041d", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date датаОГРН;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String инн;
    @XmlAttribute(name = "\u041a\u041f\u041f")
    protected String кпп;
    @XmlAttribute(name = "\u0421\u043f\u0440\u041e\u041f\u0424")
    protected String спрОПФ;
    @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u041f\u0424")
    protected String кодОПФ;
    @XmlAttribute(name = "\u041f\u043e\u043b\u043d\u041d\u0430\u0438\u043c\u041e\u041f\u0424")
    protected String полнНаимОПФ;

    /**
     * Gets the value of the infoNameUl property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoNameUl }
     *     
     */
    public DocInfoNameUl getInfoNameUl() {
        return infoNameUl;
    }

    /**
     * Sets the value of the infoNameUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoNameUl }
     *     
     */
    public void setInfoNameUl(DocInfoNameUl value) {
        this.infoNameUl = value;
    }

    /**
     * Gets the value of the свАдресЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвАдресЮЛ }
     *     
     */
    public СвАдресЮЛ getСвАдресЮЛ() {
        return свАдресЮЛ;
    }

    /**
     * Sets the value of the свАдресЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвАдресЮЛ }
     *     
     */
    public void setСвАдресЮЛ(СвАдресЮЛ value) {
        this.свАдресЮЛ = value;
    }

    /**
     * Gets the value of the свАдрЭлПочты property.
     * 
     * @return
     *     possible object is
     *     {@link СвАдрЭлПочты }
     *     
     */
    public СвАдрЭлПочты getСвАдрЭлПочты() {
        return свАдрЭлПочты;
    }

    /**
     * Sets the value of the свАдрЭлПочты property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвАдрЭлПочты }
     *     
     */
    public void setСвАдрЭлПочты(СвАдрЭлПочты value) {
        this.свАдрЭлПочты = value;
    }

    /**
     * Gets the value of the свОбрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвОбрЮЛ }
     *     
     */
    public СвОбрЮЛ getСвОбрЮЛ() {
        return свОбрЮЛ;
    }

    /**
     * Sets the value of the свОбрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвОбрЮЛ }
     *     
     */
    public void setСвОбрЮЛ(СвОбрЮЛ value) {
        this.свОбрЮЛ = value;
    }

    /**
     * Gets the value of the свРегОрг property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегОрг }
     *     
     */
    public СвРегОрг getСвРегОрг() {
        return свРегОрг;
    }

    /**
     * Sets the value of the свРегОрг property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегОрг }
     *     
     */
    public void setСвРегОрг(СвРегОрг value) {
        this.свРегОрг = value;
    }

    /**
     * Gets the value of the свСтатус property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свСтатус property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвСтатус().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoStatus }
     * 
     * 
     */
    public List<DocInfoStatus> getСвСтатус() {
        if (свСтатус == null) {
            свСтатус = new ArrayList<DocInfoStatus>();
        }
        return this.свСтатус;
    }

    /**
     * Gets the value of the свПрекрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвПрекрЮЛ }
     *     
     */
    public СвПрекрЮЛ getСвПрекрЮЛ() {
        return свПрекрЮЛ;
    }

    /**
     * Sets the value of the свПрекрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвПрекрЮЛ }
     *     
     */
    public void setСвПрекрЮЛ(СвПрекрЮЛ value) {
        this.свПрекрЮЛ = value;
    }

    /**
     * Gets the value of the свУчетНО property.
     * 
     * @return
     *     possible object is
     *     {@link СвУчетНО }
     *     
     */
    public СвУчетНО getСвУчетНО() {
        return свУчетНО;
    }

    /**
     * Sets the value of the свУчетНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУчетНО }
     *     
     */
    public void setСвУчетНО(СвУчетНО value) {
        this.свУчетНО = value;
    }

    /**
     * Gets the value of the свРегПФ property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегПФ }
     *     
     */
    public СвРегПФ getСвРегПФ() {
        return свРегПФ;
    }

    /**
     * Sets the value of the свРегПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегПФ }
     *     
     */
    public void setСвРегПФ(СвРегПФ value) {
        this.свРегПФ = value;
    }

    /**
     * Gets the value of the свРегФСС property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегФСС }
     *     
     */
    public СвРегФСС getСвРегФСС() {
        return свРегФСС;
    }

    /**
     * Sets the value of the свРегФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегФСС }
     *     
     */
    public void setСвРегФСС(СвРегФСС value) {
        this.свРегФСС = value;
    }

    /**
     * Gets the value of the свУстКап property.
     * 
     * @return
     *     possible object is
     *     {@link СвУстКап }
     *     
     */
    public СвУстКап getСвУстКап() {
        return свУстКап;
    }

    /**
     * Sets the value of the свУстКап property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУстКап }
     *     
     */
    public void setСвУстКап(СвУстКап value) {
        this.свУстКап = value;
    }

    /**
     * Gets the value of the infoUprOrganDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoUprOrganDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoUprOrganDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoUprOrganDoc }
     * 
     * 
     */
    public List<InfoUprOrganDoc> getInfoUprOrganDoc() {
        if (infoUprOrganDoc == null) {
            infoUprOrganDoc = new ArrayList<InfoUprOrganDoc>();
        }
        return this.infoUprOrganDoc;
    }

    /**
     * Gets the value of the сведДолжнФЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the сведДолжнФЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСведДолжнФЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СведДолжнФЛ }
     * 
     * 
     */
    public List<СведДолжнФЛ> getСведДолжнФЛ() {
        if (сведДолжнФЛ == null) {
            сведДолжнФЛ = new ArrayList<СведДолжнФЛ>();
        }
        return this.сведДолжнФЛ;
    }

    /**
     * Gets the value of the свУчредит property.
     * 
     * @return
     *     possible object is
     *     {@link СвУчредит }
     *     
     */
    public СвУчредит getСвУчредит() {
        return свУчредит;
    }

    /**
     * Sets the value of the свУчредит property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУчредит }
     *     
     */
    public void setСвУчредит(СвУчредит value) {
        this.свУчредит = value;
    }

    /**
     * Gets the value of the свДоляООО property.
     * 
     * @return
     *     possible object is
     *     {@link ShareCapitalEGRULType }
     *     
     */
    public ShareCapitalEGRULType getСвДоляООО() {
        return свДоляООО;
    }

    /**
     * Sets the value of the свДоляООО property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareCapitalEGRULType }
     *     
     */
    public void setСвДоляООО(ShareCapitalEGRULType value) {
        this.свДоляООО = value;
    }

    /**
     * Gets the value of the свДержРеестрАО property.
     * 
     * @return
     *     possible object is
     *     {@link СвДержРеестрАО }
     *     
     */
    public СвДержРеестрАО getСвДержРеестрАО() {
        return свДержРеестрАО;
    }

    /**
     * Sets the value of the свДержРеестрАО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвДержРеестрАО }
     *     
     */
    public void setСвДержРеестрАО(СвДержРеестрАО value) {
        this.свДержРеестрАО = value;
    }

    /**
     * Gets the value of the свОКВЭД property.
     * 
     * @return
     *     possible object is
     *     {@link СвОКВЭД }
     *     
     */
    public СвОКВЭД getСвОКВЭД() {
        return свОКВЭД;
    }

    /**
     * Sets the value of the свОКВЭД property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвОКВЭД }
     *     
     */
    public void setСвОКВЭД(СвОКВЭД value) {
        this.свОКВЭД = value;
    }

    /**
     * Gets the value of the свЛицензия property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свЛицензия property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвЛицензия().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвЛицензия }
     * 
     * 
     */
    public List<СвЛицензия> getСвЛицензия() {
        if (свЛицензия == null) {
            свЛицензия = new ArrayList<СвЛицензия>();
        }
        return this.свЛицензия;
    }

    /**
     * Gets the value of the свПодразд property.
     * 
     * @return
     *     possible object is
     *     {@link СвПодразд }
     *     
     */
    public СвПодразд getСвПодразд() {
        return свПодразд;
    }

    /**
     * Sets the value of the свПодразд property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвПодразд }
     *     
     */
    public void setСвПодразд(СвПодразд value) {
        this.свПодразд = value;
    }

    /**
     * Gets the value of the свРеорг property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свРеорг property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвРеорг().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвРеорг }
     * 
     * 
     */
    public List<СвРеорг> getСвРеорг() {
        if (свРеорг == null) {
            свРеорг = new ArrayList<СвРеорг>();
        }
        return this.свРеорг;
    }

    /**
     * Gets the value of the свПредш property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свПредш property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвПредш().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвПредш }
     * 
     * 
     */
    public List<СвПредш> getСвПредш() {
        if (свПредш == null) {
            свПредш = new ArrayList<СвПредш>();
        }
        return this.свПредш;
    }

    /**
     * Gets the value of the свКФХПредш property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свКФХПредш property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвКФХПредш().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвКФХПредш }
     * 
     * 
     */
    public List<СвКФХПредш> getСвКФХПредш() {
        if (свКФХПредш == null) {
            свКФХПредш = new ArrayList<СвКФХПредш>();
        }
        return this.свКФХПредш;
    }

    /**
     * Gets the value of the свПреем property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свПреем property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвПреем().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвПреем }
     * 
     * 
     */
    public List<СвПреем> getСвПреем() {
        if (свПреем == null) {
            свПреем = new ArrayList<СвПреем>();
        }
        return this.свПреем;
    }

    /**
     * Gets the value of the свКФХПреем property.
     * 
     * @return
     *     possible object is
     *     {@link СвКФХПреем }
     *     
     */
    public СвКФХПреем getСвКФХПреем() {
        return свКФХПреем;
    }

    /**
     * Sets the value of the свКФХПреем property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвКФХПреем }
     *     
     */
    public void setСвКФХПреем(СвКФХПреем value) {
        this.свКФХПреем = value;
    }

    /**
     * Gets the value of the свЗапЕГРЮЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свЗапЕГРЮЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвЗапЕГРЮЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвЗапЕГРЮЛ }
     * 
     * 
     */
    public List<СвЗапЕГРЮЛ> getСвЗапЕГРЮЛ() {
        if (свЗапЕГРЮЛ == null) {
            свЗапЕГРЮЛ = new ArrayList<СвЗапЕГРЮЛ>();
        }
        return this.свЗапЕГРЮЛ;
    }

    /**
     * Gets the value of the датаВып property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаВып() {
        return датаВып;
    }

    /**
     * Sets the value of the датаВып property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаВып(Date value) {
        this.датаВып = value;
    }

    /**
     * Gets the value of the огрн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОГРН() {
        return огрн;
    }

    /**
     * Sets the value of the огрн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОГРН(String value) {
        this.огрн = value;
    }

    /**
     * Gets the value of the датаОГРН property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getДатаОГРН() {
        return датаОГРН;
    }

    /**
     * Sets the value of the датаОГРН property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setДатаОГРН(Date value) {
        this.датаОГРН = value;
    }

    /**
     * Gets the value of the инн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИНН() {
        return инн;
    }

    /**
     * Sets the value of the инн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИНН(String value) {
        this.инн = value;
    }

    /**
     * Gets the value of the кпп property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКПП() {
        return кпп;
    }

    /**
     * Sets the value of the кпп property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКПП(String value) {
        this.кпп = value;
    }

    /**
     * Gets the value of the спрОПФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСпрОПФ() {
        return спрОПФ;
    }

    /**
     * Sets the value of the спрОПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСпрОПФ(String value) {
        this.спрОПФ = value;
    }

    /**
     * Gets the value of the кодОПФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодОПФ() {
        return кодОПФ;
    }

    /**
     * Sets the value of the кодОПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодОПФ(String value) {
        this.кодОПФ = value;
    }

    /**
     * Gets the value of the полнНаимОПФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПолнНаимОПФ() {
        return полнНаимОПФ;
    }

    /**
     * Sets the value of the полнНаимОПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПолнНаимОПФ(String value) {
        this.полнНаимОПФ = value;
    }

}
