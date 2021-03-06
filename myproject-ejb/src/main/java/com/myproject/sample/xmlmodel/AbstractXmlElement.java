package com.myproject.sample.xmlmodel;

import com.myproject.sample.canvas.ICanvas;
import com.myproject.sample.exception.UnsuccessfulProcessingException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.io.File;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AbstractXmlElement {
    @XmlAttribute
    protected int x;

    @XmlAttribute
    protected int y;

    @XmlAttribute
    protected int width;

    @XmlAttribute
    protected int height;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract void drawOnCanvas(ICanvas canvas, File projectFolder) throws UnsuccessfulProcessingException;

    protected void setElementAbsoluteCoordinates(AbstractXmlContainer parent){
        setX(parent.getX() + x);
        setY(parent.getY() + y);
    }
}
