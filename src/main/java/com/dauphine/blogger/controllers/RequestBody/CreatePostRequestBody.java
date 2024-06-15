package com.dauphine.blogger.controllers.RequestBody;

import java.util.UUID;

public record CreatePostRequestBody(String title, String content, UUID categoryId) {
}
