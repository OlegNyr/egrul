
package ru.nyrk.egrul.generate.egrul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения, содержащиеся в Едином государственном реестре юридических лиц
 * 
 * <p>Java class for EGRUL element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="EGRUL">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="СвЮЛ">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="СвНаимЮЛ">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="НаимЮЛПолн" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="НаимЮЛСокр">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="500"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвАдресЮЛ">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="АдресРФ" type="{}АдрРФЕГРЮЛТип"/>
 *                               &lt;element name="СведОтсутАдресЮЛ" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="РешСудНедАдр" type="{}РешСудТип" minOccurs="0"/>
 *                                         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ПризнОтсутАдресЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвАдрЭлПочты" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="E-mail" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="45"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвОбрЮЛ">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СпОбрЮЛ">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="КодСпОбрЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НаимСпОбрЮЛ">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="5"/>
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                             &lt;attribute name="ДатаОГРН" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="РегНом">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="ДатаРег">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="НаимРО">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвРегОрг">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="КодНО" use="required" type="{}СОНОТип" />
 *                             &lt;attribute name="НаимНО" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="10"/>
 *                                   &lt;maxLength value="250"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="АдрРО">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="10"/>
 *                                   &lt;maxLength value="128"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвСтатус" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвСтатус">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="КодСтатусЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НаимСтатусЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="5"/>
 *                                             &lt;maxLength value="500"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="СвРешИсклЮЛ" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="ДатаРеш" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НомерРеш" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="ДатаПубликации" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                             &lt;minInclusive value="2005-07-06"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НомерЖурнала">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвПрекрЮЛ" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СпПрекрЮЛ">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="КодСпПрекрЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НаимСпПрекрЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="5"/>
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="СвРегОрг" type="{}СвРегОргТип"/>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ДатаПрекрЮЛ" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвУчетНО" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвНО" type="{}СвНОТип"/>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ИНН" use="required" type="{}ИННЮЛТип" />
 *                             &lt;attribute name="КПП" use="required" type="{}КППТип" />
 *                             &lt;attribute name="ДатаПостУч" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвРегПФ" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвОргПФ">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="КодПФ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="6"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НаимПФ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="10"/>
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="РегНомПФ" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="ДатаРег" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвРегФСС" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвОргФСС">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="КодФСС" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НаимФСС" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="10"/>
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="РегНомФСС" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="ДатаРег" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвУстКап" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ДоляРубля" type="{}ДробьТип" minOccurs="0"/>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                               &lt;element name="СведУмУК" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ВелУмУК" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;totalDigits value="19"/>
 *                                             &lt;fractionDigits value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="ДатаРеш" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="НаимВидКап" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="10"/>
 *                                   &lt;maxLength value="20"/>
 *                                   &lt;enumeration value="УСТАВНЫЙ КАПИТАЛ"/>
 *                                   &lt;enumeration value="СКЛАДОЧНЫЙ КАПИТАЛ"/>
 *                                   &lt;enumeration value="УСТАВНЫЙ ФОНД"/>
 *                                   &lt;enumeration value="ПАЕВЫЕ ВЗНОСЫ"/>
 *                                   &lt;enumeration value="ПАЕВОЙ ФОНД"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="СумКап" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="19"/>
 *                                   &lt;fractionDigits value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвУпрОрг" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                               &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                               &lt;element name="СвРегИн" type="{}СвРегИнЮЛЕГРЮЛТип" minOccurs="0"/>
 *                               &lt;element name="СвПредЮЛ" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="НаимПредЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="1000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="СвАдрРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                               &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *                               &lt;element name="ПредИнЮЛ" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                                         &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *                                         &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СведДолжнФЛ" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                               &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                               &lt;element name="СвДолжн">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ОГРНИП" type="{}ОГРНИПТип" />
 *                                       &lt;attribute name="ВидДолжн" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НаимВидДолжн" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="5"/>
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НаимДолжн" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="СвНомТел" type="{}СвНомТелТип" minOccurs="0"/>
 *                               &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                               &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                               &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                               &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                               &lt;element name="СвДискв" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ДатаНачДискв" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                       &lt;attribute name="ДатаОкончДискв" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                       &lt;attribute name="ДатаРеш" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвУчредит" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="УчрЮЛРос" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                                         &lt;element name="СвРегСтарые" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="РегНом">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="ДатаРег">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="НаимРО">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="УчрЮЛИн" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                                         &lt;element name="СвРегИн" type="{}СвРегИнЮЛЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="УчрФЛ" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                                         &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                                         &lt;element name="СвДовУпрЮЛ" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                   &lt;element name="НаимИННДовУпр" type="{}СвЮЛЕГРЮЛТип"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвДовУпрФЛ" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                                                   &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="ЛицоУпрНасл" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                                                   &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="ДатаОткрНасл" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="УчрРФСубМО" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="ВидНаимУчр">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="КодУчрРФСубМО" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                       &lt;enumeration value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="НаимМО">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="КодРегион" type="{}CCРФТип" />
 *                                                 &lt;attribute name="НаимРегион">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="100"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="СвОргОсущПр" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                   &lt;element name="НаимИННЮЛ" type="{}СвЮЛЕГРЮЛТип"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвФЛОсущПр" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                   &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                                                   &lt;element name="СвРождФЛ" type="{}СвРождЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="УдЛичнФЛ" type="{}УдЛичнЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="АдресМЖРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                                   &lt;element name="АдрМЖИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="УчрПИФ" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="СвНаимПИФ">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                                   &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="НаимПИФ" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="1000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвУпрКомпПИФ">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                   &lt;element name="УпрКомпПиф" type="{}СвЮЛЕГРЮЛТип"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДоляУстКап" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="СвОбрем" type="{}СвОбремТип" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвДоляООО" type="{}ДоляУстКапЕГРЮЛТип" minOccurs="0"/>
 *                     &lt;element name="СвДержРеестрАО" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                               &lt;element name="ДержРеестрАО" type="{}СвЮЛЕГРЮЛТип"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвОКВЭД" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвОКВЭДОсн" type="{}СвОКВЭДТип" minOccurs="0"/>
 *                               &lt;element name="СвОКВЭДДоп" type="{}СвОКВЭДТип" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвЛицензия" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="НаимЛицВидДеят" maxOccurs="unbounded">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="1000"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="МестоДейстЛиц" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="5"/>
 *                                     &lt;maxLength value="500"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ЛицОргВыдЛиц" minOccurs="0">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="500"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                               &lt;element name="СвПриостЛиц" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                                         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ДатаПриостЛиц" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="ЛицОргПриостЛиц" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="10"/>
 *                                             &lt;maxLength value="500"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="СерЛиц">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="НомЛиц" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="ВидЛиц">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="10"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="ДатаЛиц" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                             &lt;attribute name="ДатаНачЛиц" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                             &lt;attribute name="ДатаОкончЛиц" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвПодразд" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвФилиал" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="СвНаим" type="{}СвНаимПодраздТип" minOccurs="0"/>
 *                                         &lt;element name="АдрМНРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="АдрМНИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="СвУчетНОФилиал" type="{}СвУчетНОПодраздТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="СвПредстав" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаПерв" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="СвНаим" type="{}СвНаимПодраздТип" minOccurs="0"/>
 *                                         &lt;element name="АдрМНРФ" type="{}АдрРФЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="АдрМНИн" type="{}АдрИнЕГРЮЛТип" minOccurs="0"/>
 *                                         &lt;element name="СвУчетНОПредстав" type="{}СвУчетНОПодраздТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвРеорг" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвСтатус">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="КодСтатусЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="НаимСтатусЮЛ" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="5"/>
 *                                             &lt;maxLength value="500"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИзмСостРеоргЮЛ" type="{}ГРНДатаТип" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;element name="СвРеоргЮЛ" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                                       &lt;attribute name="ИНН" use="required" type="{}ИННЮЛТип" />
 *                                       &lt;attribute name="НаимЮЛПолн" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="1000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="СостЮЛпосле">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="30"/>
 *                                             &lt;maxLength value="50"/>
 *                                             &lt;enumeration value="ПРЕКРАТИТ ДЕЯТЕЛЬНОСТЬ ПОСЛЕ РЕОРГАНИЗАЦИИ"/>
 *                                             &lt;enumeration value="ПРОДОЛЖИТ ДЕЯТЕЛЬНОСТЬ ПОСЛЕ РЕОРГАНИЗАЦИИ"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвПредш" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвЮЛсложнРеорг" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                                       &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                                       &lt;attribute name="НаимЮЛПолн" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="1000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                             &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                             &lt;attribute name="НаимЮЛПолн" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвКФХПредш" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ОГРНИП" use="required" type="{}ОГРНИПТип" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвПреем" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвЮЛсложнРеорг" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                                       &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                                       &lt;attribute name="НаимЮЛПолн" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="1000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДата" type="{}ГРНДатаТип"/>
 *                               &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                             &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                             &lt;attribute name="НаимЮЛПолн" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвКФХПреем" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвФЛ" type="{}СвФЛЕГРЮЛТип"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ОГРНИП" use="required" type="{}ОГРНИПТип" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="СвЗапЕГРЮЛ" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ВидЗап" type="{}ВидЗапТип"/>
 *                               &lt;element name="СвРегОрг" type="{}СвРегОргТип"/>
 *                               &lt;element name="СвЗаявФЛ" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ВидЗаяв">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="КодСЗОЮЛ" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                                 &lt;attribute name="НаимСЗОЮЛ" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="500"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвЮЛ" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                                                 &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                                                 &lt;attribute name="НаимЮЛПолн" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="1000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвУпрОрг" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ОГРН" type="{}ОГРНТип" />
 *                                                 &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                                                 &lt;attribute name="НаимЮЛПолн" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="1000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвФЛ">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="СвФИОИНН">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                           &lt;/sequence>
 *                                                           &lt;attribute name="Фамилия">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="Имя">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="Отчество">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="ИННФЛ" type="{}ИННФЛТип" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="СвРожд" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                           &lt;/sequence>
 *                                                           &lt;attribute name="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                           &lt;attribute name="МестоРожд" use="required">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="255"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="ПрДатаРожд">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="1"/>
 *                                                                 &lt;enumeration value="1"/>
 *                                                                 &lt;enumeration value="2"/>
 *                                                                 &lt;enumeration value="3"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="УдЛичнФЛ" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                           &lt;/sequence>
 *                                                           &lt;attribute name="КодВидДок" use="required" type="{}СПДУЛТип" />
 *                                                           &lt;attribute name="НаимДок" use="required">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="100"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="СерНомДок" use="required">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="50"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                           &lt;attribute name="ВыдДок">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="255"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="КодВыдДок">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="7"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="АдресМЖРФ" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="Регион" type="{}РегионТип"/>
 *                                                             &lt;element name="Район" type="{}РайонТип" minOccurs="0"/>
 *                                                             &lt;element name="Город" type="{}ГородТип" minOccurs="0"/>
 *                                                             &lt;element name="НаселПункт" type="{}НаселПунктТип" minOccurs="0"/>
 *                                                             &lt;element name="Улица" type="{}УлицаТип" minOccurs="0"/>
 *                                                             &lt;element name="ГРНДата" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                           &lt;/sequence>
 *                                                           &lt;attribute name="Индекс">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="6"/>
 *                                                                 &lt;pattern value="[0-9]{6}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="КодРегион" use="required">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{}CCРФТип">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="КодАдрКладр">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="11"/>
 *                                                                 &lt;maxLength value="19"/>
 *                                                                 &lt;pattern value="[0-9]{11}"/>
 *                                                                 &lt;pattern value="[0-9]{15}"/>
 *                                                                 &lt;pattern value="[0-9]{19}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="Дом">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="50"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="Корпус">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="50"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="Кварт">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="50"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="АдрМЖИн" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="ГРНДатаИспр" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                                           &lt;/sequence>
 *                                                           &lt;attribute name="ОКСМ" use="required">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{}ОКСМТип">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="НаимСтран" use="required">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="250"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                           &lt;attribute name="АдрИн">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="255"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/attribute>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="СведПредДок" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="НаимДок">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;maxLength value="255"/>
 *                                               &lt;minLength value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="НомДок" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;maxLength value="50"/>
 *                                               &lt;minLength value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДатаДок" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                               &lt;minInclusive value="1900-01-01"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="СвСвид" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаСвидНед" type="{}ГРНДатаТип" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="Серия" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="Номер" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="7"/>
 *                                             &lt;maxLength value="9"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                       &lt;attribute name="ДатаВыдСвид" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ГРНДатаИспрПред" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *                               &lt;element name="ГРНДатаНедПред" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *                               &lt;element name="СвСтатусЗап" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ГРНДатаНед" type="{}ИдГРНДатаТип" minOccurs="0"/>
 *                                         &lt;element name="ГРНДатаИспр" type="{}ИдГРНДатаТип" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ИдЗап" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;totalDigits value="19"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="ГРН" type="{}ОГРНТип" />
 *                             &lt;attribute name="ДатаЗап" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="ДатаВып" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                   &lt;attribute name="ОГРН" use="required" type="{}ОГРНТип" />
 *                   &lt;attribute name="ДатаОГРН" use="required">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ИНН" type="{}ИННЮЛТип" />
 *                   &lt;attribute name="КПП" type="{}КППТип" />
 *                   &lt;attribute name="СпрОПФ">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="4"/>
 *                         &lt;maxLength value="5"/>
 *                         &lt;enumeration value="ОКОПФ"/>
 *                         &lt;enumeration value="КОПФ"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="КодОПФ">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ПолнНаимОПФ">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="4"/>
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "svUl"
})
@XmlRootElement(name = "EGRUL")
public class EGRUL {

    @XmlElement(name = "\u0421\u0432\u042e\u041b", required = true)
    protected DocSvUl svUl;

    /**
     * Gets the value of the svUl property.
     * 
     * @return
     *     possible object is
     *     {@link DocSvUl }
     *     
     */
    public DocSvUl getSvUl() {
        return svUl;
    }

    /**
     * Sets the value of the svUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSvUl }
     *     
     */
    public void setSvUl(DocSvUl value) {
        this.svUl = value;
    }

}
