package com.java.creational.c5builder;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class DocumentApp {
    @Getter
    @Setter
    public static class Document {
        private String title;
        private String author;
        private String category;
        private String content;
        private LocalDateTime releaseAt;

        protected Document(String title, String author, String category, String content, LocalDateTime releaseAt) {
            this.title = title;
            this.author = author;
            this.category = category;
            this.content = content;
            this.releaseAt = releaseAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String title;
            private String author;
            private String category;
            private LocalDateTime releaseAt;
            private final StringBuilder contentBuilder = new StringBuilder();

            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Builder author(String author) {
                this.author = author;
                return this;
            }

            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public Builder addToContent(String contentPart) {
                if (contentBuilder.length() > 0) {
                    contentBuilder.append(' ');
                }
                contentBuilder.append(contentPart);
                return this;
            }

            public Builder releaseAt(LocalDateTime releaseAt) {
                this.releaseAt = releaseAt;
                return this;
            }

        }
    }

    public static void main(String[] args) {
        final Document document = Document.builder().title("Master Design Pattern").
                author("Dina Phan")
                .category("Tech")
                .addToContent("Builder")
                .addToContent("Responsss")
                .build();
    }
}

