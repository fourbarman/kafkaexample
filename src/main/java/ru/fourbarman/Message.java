package ru.fourbarman;

import java.time.LocalDateTime;

public record Message(String message,
                      LocalDateTime created) {
}
