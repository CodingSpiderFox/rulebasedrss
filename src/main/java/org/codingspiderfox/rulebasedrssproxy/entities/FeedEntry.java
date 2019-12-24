package org.codingspiderfox.rulebasedrssproxy.entities;

import java.nio.charset.Charset;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "feedentry")
public class FeedEntry {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Lob
    @Column(name = "feedItem")
    private Serializable feedItem;

    @ManyToOne
    @JoinColumn(name = "feedId")
    private Feed feed;


    private String subject;

    public String getSubject() {
        return subject;
    }
}
