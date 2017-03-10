
package ru.nyrk.generate.egrul;

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
    "infoAddressUl",
    "infoAddressEmail",
    "docInfoRegisterUL",
    "docInfoRegistrator",
    "docInfoStatusUL",
    "docInfoEndUL",
    "docInfoUchetNalogOrgan",
    "docInfoRegisterPF",
    "docInfoRegisterFSSType",
    "docInfoUstavKapital",
    "docInfoUprOrgan",
    "docInfoLicoDoveren",
    "docInfoUchered",
    "docInfoDoluOOO",
    "docInfoReestrAO",
    "docInfoOKVED",
    "docInfoLicensia",
    "docInfoPodrazdel",
    "docInfoReorgan",
    "docInfoPredshtstv",
    "docInfoKFHPredshtstv",
    "docInfoPreemnik",
    "docInfoKFHPreemnik",
    "docInfoRecordEGRUL"
})
public class DocInfoULType {

    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b", required = true)
    protected DocInfoNameUl infoNameUl;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441\u042e\u041b", required = true)
    protected DocInfoAddressUl infoAddressUl;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u042d\u043b\u041f\u043e\u0447\u0442\u044b")
    protected DocInfoAddressEmailType infoAddressEmail;
    @XmlElement(name = "\u0421\u0432\u041e\u0431\u0440\u042e\u041b", required = true)
    protected DocInfoRegisterULType docInfoRegisterUL;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433", required = true)
    protected DocInfoRegistratorType docInfoRegistrator;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441")
    protected List<DocInfoStatusType> docInfoStatusUL;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u043a\u0440\u042e\u041b")
    protected DocInfoEndULType docInfoEndUL;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
    protected DocInfoUchetNalogOrgan docInfoUchetNalogOrgan;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041f\u0424")
    protected DocInfoRegisterPFType docInfoRegisterPF;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
    protected DocInfoRegisterFSSType docInfoRegisterFSSType;
    @XmlElement(name = "\u0421\u0432\u0423\u0441\u0442\u041a\u0430\u043f")
    protected DocInfoUstavKapitalType docInfoUstavKapital;
    @XmlElement(name = "\u0421\u0432\u0423\u043f\u0440\u041e\u0440\u0433")
    protected List<DocInfoUprOrganType> docInfoUprOrgan;
    @XmlElement(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b")
    protected List<DocInfoLicoDoverenType> docInfoLicoDoveren;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0440\u0435\u0434\u0438\u0442")
    protected DocInfoUcheredType docInfoUchered;
    @XmlElement(name = "\u0421\u0432\u0414\u043e\u043b\u044f\u041e\u041e\u041e")
    protected ShareCapitalEGRULType docInfoDoluOOO;
    @XmlElement(name = "\u0421\u0432\u0414\u0435\u0440\u0436\u0420\u0435\u0435\u0441\u0442\u0440\u0410\u041e")
    protected DocInfoReestrAOType docInfoReestrAO;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
    protected DocInfoOKVEDType docInfoOKVED;
    @XmlElement(name = "\u0421\u0432\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f")
    protected List<DocInfoLicensiaType> docInfoLicensia;
    @XmlElement(name = "\u0421\u0432\u041f\u043e\u0434\u0440\u0430\u0437\u0434")
    protected DocInfoPodrazdelType docInfoPodrazdel;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u043e\u0440\u0433")
    protected List<DocInfoReorganType> docInfoReorgan;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u0434\u0448")
    protected List<DocInfoPredshtstvType> docInfoPredshtstv;
    @XmlElement(name = "\u0421\u0432\u041a\u0424\u0425\u041f\u0440\u0435\u0434\u0448")
    protected List<DocInfoKFHPredshestvType> docInfoKFHPredshtstv;
    @XmlElement(name = "\u0421\u0432\u041f\u0440\u0435\u0435\u043c")
    protected List<DocInfoPreemnikType> docInfoPreemnik;
    @XmlElement(name = "\u0421\u0432\u041a\u0424\u0425\u041f\u0440\u0435\u0435\u043c")
    protected DocInfoKFHPrimnikType docInfoKFHPreemnik;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043f\u0415\u0413\u0420\u042e\u041b", required = true)
    protected List<DocInfoRecordEGRULType> docInfoRecordEGRUL;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u044b\u043f", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date dateRecord;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d", required = true)
    protected String ogrn;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0413\u0420\u041d", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date dateOGRN;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String inn;
    @XmlAttribute(name = "\u041a\u041f\u041f")
    protected String kpp;
    @XmlAttribute(name = "\u0421\u043f\u0440\u041e\u041f\u0424")
    protected String sprOPF;
    @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u041f\u0424")
    protected String kodOPF;
    @XmlAttribute(name = "\u041f\u043e\u043b\u043d\u041d\u0430\u0438\u043c\u041e\u041f\u0424")
    protected String fullNameOPF;

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
     * Gets the value of the infoAddressUl property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoAddressUl }
     *     
     */
    public DocInfoAddressUl getInfoAddressUl() {
        return infoAddressUl;
    }

    /**
     * Sets the value of the infoAddressUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoAddressUl }
     *     
     */
    public void setInfoAddressUl(DocInfoAddressUl value) {
        this.infoAddressUl = value;
    }

    /**
     * Gets the value of the infoAddressEmail property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoAddressEmailType }
     *     
     */
    public DocInfoAddressEmailType getInfoAddressEmail() {
        return infoAddressEmail;
    }

    /**
     * Sets the value of the infoAddressEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoAddressEmailType }
     *     
     */
    public void setInfoAddressEmail(DocInfoAddressEmailType value) {
        this.infoAddressEmail = value;
    }

    /**
     * Gets the value of the docInfoRegisterUL property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoRegisterULType }
     *     
     */
    public DocInfoRegisterULType getDocInfoRegisterUL() {
        return docInfoRegisterUL;
    }

    /**
     * Sets the value of the docInfoRegisterUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoRegisterULType }
     *     
     */
    public void setDocInfoRegisterUL(DocInfoRegisterULType value) {
        this.docInfoRegisterUL = value;
    }

    /**
     * Gets the value of the docInfoRegistrator property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoRegistratorType }
     *     
     */
    public DocInfoRegistratorType getDocInfoRegistrator() {
        return docInfoRegistrator;
    }

    /**
     * Sets the value of the docInfoRegistrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoRegistratorType }
     *     
     */
    public void setDocInfoRegistrator(DocInfoRegistratorType value) {
        this.docInfoRegistrator = value;
    }

    /**
     * Gets the value of the docInfoStatusUL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoStatusUL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoStatusUL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoStatusType }
     * 
     * 
     */
    public List<DocInfoStatusType> getDocInfoStatusUL() {
        if (docInfoStatusUL == null) {
            docInfoStatusUL = new ArrayList<DocInfoStatusType>();
        }
        return this.docInfoStatusUL;
    }

    /**
     * Gets the value of the docInfoEndUL property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoEndULType }
     *     
     */
    public DocInfoEndULType getDocInfoEndUL() {
        return docInfoEndUL;
    }

    /**
     * Sets the value of the docInfoEndUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoEndULType }
     *     
     */
    public void setDocInfoEndUL(DocInfoEndULType value) {
        this.docInfoEndUL = value;
    }

    /**
     * Gets the value of the docInfoUchetNalogOrgan property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoUchetNalogOrgan }
     *     
     */
    public DocInfoUchetNalogOrgan getDocInfoUchetNalogOrgan() {
        return docInfoUchetNalogOrgan;
    }

    /**
     * Sets the value of the docInfoUchetNalogOrgan property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoUchetNalogOrgan }
     *     
     */
    public void setDocInfoUchetNalogOrgan(DocInfoUchetNalogOrgan value) {
        this.docInfoUchetNalogOrgan = value;
    }

    /**
     * Gets the value of the docInfoRegisterPF property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoRegisterPFType }
     *     
     */
    public DocInfoRegisterPFType getDocInfoRegisterPF() {
        return docInfoRegisterPF;
    }

    /**
     * Sets the value of the docInfoRegisterPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoRegisterPFType }
     *     
     */
    public void setDocInfoRegisterPF(DocInfoRegisterPFType value) {
        this.docInfoRegisterPF = value;
    }

    /**
     * Gets the value of the docInfoRegisterFSSType property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoRegisterFSSType }
     *     
     */
    public DocInfoRegisterFSSType getDocInfoRegisterFSSType() {
        return docInfoRegisterFSSType;
    }

    /**
     * Sets the value of the docInfoRegisterFSSType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoRegisterFSSType }
     *     
     */
    public void setDocInfoRegisterFSSType(DocInfoRegisterFSSType value) {
        this.docInfoRegisterFSSType = value;
    }

    /**
     * Gets the value of the docInfoUstavKapital property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoUstavKapitalType }
     *     
     */
    public DocInfoUstavKapitalType getDocInfoUstavKapital() {
        return docInfoUstavKapital;
    }

    /**
     * Sets the value of the docInfoUstavKapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoUstavKapitalType }
     *     
     */
    public void setDocInfoUstavKapital(DocInfoUstavKapitalType value) {
        this.docInfoUstavKapital = value;
    }

    /**
     * Gets the value of the docInfoUprOrgan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoUprOrgan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoUprOrgan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoUprOrganType }
     * 
     * 
     */
    public List<DocInfoUprOrganType> getDocInfoUprOrgan() {
        if (docInfoUprOrgan == null) {
            docInfoUprOrgan = new ArrayList<DocInfoUprOrganType>();
        }
        return this.docInfoUprOrgan;
    }

    /**
     * Gets the value of the docInfoLicoDoveren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoLicoDoveren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoLicoDoveren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoLicoDoverenType }
     * 
     * 
     */
    public List<DocInfoLicoDoverenType> getDocInfoLicoDoveren() {
        if (docInfoLicoDoveren == null) {
            docInfoLicoDoveren = new ArrayList<DocInfoLicoDoverenType>();
        }
        return this.docInfoLicoDoveren;
    }

    /**
     * Gets the value of the docInfoUchered property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoUcheredType }
     *     
     */
    public DocInfoUcheredType getDocInfoUchered() {
        return docInfoUchered;
    }

    /**
     * Sets the value of the docInfoUchered property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoUcheredType }
     *     
     */
    public void setDocInfoUchered(DocInfoUcheredType value) {
        this.docInfoUchered = value;
    }

    /**
     * Gets the value of the docInfoDoluOOO property.
     * 
     * @return
     *     possible object is
     *     {@link ShareCapitalEGRULType }
     *     
     */
    public ShareCapitalEGRULType getDocInfoDoluOOO() {
        return docInfoDoluOOO;
    }

    /**
     * Sets the value of the docInfoDoluOOO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareCapitalEGRULType }
     *     
     */
    public void setDocInfoDoluOOO(ShareCapitalEGRULType value) {
        this.docInfoDoluOOO = value;
    }

    /**
     * Gets the value of the docInfoReestrAO property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoReestrAOType }
     *     
     */
    public DocInfoReestrAOType getDocInfoReestrAO() {
        return docInfoReestrAO;
    }

    /**
     * Sets the value of the docInfoReestrAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoReestrAOType }
     *     
     */
    public void setDocInfoReestrAO(DocInfoReestrAOType value) {
        this.docInfoReestrAO = value;
    }

    /**
     * Gets the value of the docInfoOKVED property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoOKVEDType }
     *     
     */
    public DocInfoOKVEDType getDocInfoOKVED() {
        return docInfoOKVED;
    }

    /**
     * Sets the value of the docInfoOKVED property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoOKVEDType }
     *     
     */
    public void setDocInfoOKVED(DocInfoOKVEDType value) {
        this.docInfoOKVED = value;
    }

    /**
     * Gets the value of the docInfoLicensia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoLicensia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoLicensia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoLicensiaType }
     * 
     * 
     */
    public List<DocInfoLicensiaType> getDocInfoLicensia() {
        if (docInfoLicensia == null) {
            docInfoLicensia = new ArrayList<DocInfoLicensiaType>();
        }
        return this.docInfoLicensia;
    }

    /**
     * Gets the value of the docInfoPodrazdel property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoPodrazdelType }
     *     
     */
    public DocInfoPodrazdelType getDocInfoPodrazdel() {
        return docInfoPodrazdel;
    }

    /**
     * Sets the value of the docInfoPodrazdel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoPodrazdelType }
     *     
     */
    public void setDocInfoPodrazdel(DocInfoPodrazdelType value) {
        this.docInfoPodrazdel = value;
    }

    /**
     * Gets the value of the docInfoReorgan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoReorgan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoReorgan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoReorganType }
     * 
     * 
     */
    public List<DocInfoReorganType> getDocInfoReorgan() {
        if (docInfoReorgan == null) {
            docInfoReorgan = new ArrayList<DocInfoReorganType>();
        }
        return this.docInfoReorgan;
    }

    /**
     * Gets the value of the docInfoPredshtstv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoPredshtstv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoPredshtstv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoPredshtstvType }
     * 
     * 
     */
    public List<DocInfoPredshtstvType> getDocInfoPredshtstv() {
        if (docInfoPredshtstv == null) {
            docInfoPredshtstv = new ArrayList<DocInfoPredshtstvType>();
        }
        return this.docInfoPredshtstv;
    }

    /**
     * Gets the value of the docInfoKFHPredshtstv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoKFHPredshtstv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoKFHPredshtstv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoKFHPredshestvType }
     * 
     * 
     */
    public List<DocInfoKFHPredshestvType> getDocInfoKFHPredshtstv() {
        if (docInfoKFHPredshtstv == null) {
            docInfoKFHPredshtstv = new ArrayList<DocInfoKFHPredshestvType>();
        }
        return this.docInfoKFHPredshtstv;
    }

    /**
     * Gets the value of the docInfoPreemnik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoPreemnik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoPreemnik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoPreemnikType }
     * 
     * 
     */
    public List<DocInfoPreemnikType> getDocInfoPreemnik() {
        if (docInfoPreemnik == null) {
            docInfoPreemnik = new ArrayList<DocInfoPreemnikType>();
        }
        return this.docInfoPreemnik;
    }

    /**
     * Gets the value of the docInfoKFHPreemnik property.
     * 
     * @return
     *     possible object is
     *     {@link DocInfoKFHPrimnikType }
     *     
     */
    public DocInfoKFHPrimnikType getDocInfoKFHPreemnik() {
        return docInfoKFHPreemnik;
    }

    /**
     * Sets the value of the docInfoKFHPreemnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInfoKFHPrimnikType }
     *     
     */
    public void setDocInfoKFHPreemnik(DocInfoKFHPrimnikType value) {
        this.docInfoKFHPreemnik = value;
    }

    /**
     * Gets the value of the docInfoRecordEGRUL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docInfoRecordEGRUL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocInfoRecordEGRUL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocInfoRecordEGRULType }
     * 
     * 
     */
    public List<DocInfoRecordEGRULType> getDocInfoRecordEGRUL() {
        if (docInfoRecordEGRUL == null) {
            docInfoRecordEGRUL = new ArrayList<DocInfoRecordEGRULType>();
        }
        return this.docInfoRecordEGRUL;
    }

    /**
     * Gets the value of the dateRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateRecord() {
        return dateRecord;
    }

    /**
     * Sets the value of the dateRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRecord(Date value) {
        this.dateRecord = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the dateOGRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateOGRN() {
        return dateOGRN;
    }

    /**
     * Sets the value of the dateOGRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOGRN(Date value) {
        this.dateOGRN = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the sprOPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSprOPF() {
        return sprOPF;
    }

    /**
     * Sets the value of the sprOPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSprOPF(String value) {
        this.sprOPF = value;
    }

    /**
     * Gets the value of the kodOPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodOPF() {
        return kodOPF;
    }

    /**
     * Sets the value of the kodOPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodOPF(String value) {
        this.kodOPF = value;
    }

    /**
     * Gets the value of the fullNameOPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameOPF() {
        return fullNameOPF;
    }

    /**
     * Sets the value of the fullNameOPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameOPF(String value) {
        this.fullNameOPF = value;
    }

}
