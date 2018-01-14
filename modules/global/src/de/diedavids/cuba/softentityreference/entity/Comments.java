package de.diedavids.cuba.softentityreference.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "DDCSEF_COMMENTS")
@Entity(name = "ddcsef$Comments")
public class Comments extends StandardEntity {
    private static final long serialVersionUID = 5719925818360110149L;

    @Column(name = "TEXT")
    protected String text;

    @MetaProperty(datatype = "entitySoftReference")
    @Column(name = "COMMENTABLE")
    protected String commentable;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setCommentable(String commentable) {
        this.commentable = commentable;
    }

    public String getCommentable() {
        return commentable;
    }


}