#!/bin/bash

URL="http://localhost:8080/products"

PRODUCTS='[
  {"id": 1, "name": "Samsung Galaxy S5", "price": 1222, "category": "Smartphone", "inStock": true, "rating": 4.3},
  {"id": 2, "name": "iPhone 12", "price": 899, "category": "Smartphone", "inStock": false, "rating": 4.7},
  {"id": 3, "name": "Google Pixel 6", "price": 749, "category": "Smartphone", "inStock": true, "rating": 4.5},
  {"id": 4, "name": "OnePlus 9", "price": 699, "category": "Smartphone", "inStock": true, "rating": 4.4},
  {"id": 5, "name": "Sony Xperia 5 II", "price": 799, "category": "Smartphone", "inStock": false, "rating": 4.2},
  {"id": 6, "name": "Realme GT", "price": 499, "category": "Smartphone", "inStock": true, "rating": 4.0},
  {"id": 7, "name": "Motorola Edge 20", "price": 599, "category": "Smartphone", "inStock": true, "rating": 4.1},
  {"id": 8, "name": "Xiaomi Mi 11", "price": 699, "category": "Smartphone", "inStock": true, "rating": 4.3},
  {"id": 9, "name": "Samsung Galaxy Watch 4", "price": 249, "category": "Smartwatch", "inStock": true, "rating": 4.6},
  {"id": 10, "name": "Apple Watch Series 7", "price": 399, "category": "Smartwatch", "inStock": true, "rating": 4.8},
  {"id": 11, "name": "Fitbit Versa 3", "price": 229, "category": "Smartwatch", "inStock": true, "rating": 4.2},
  {"id": 12, "name": "Garmin Venu 2", "price": 399, "category": "Smartwatch", "inStock": true, "rating": 4.5},
  {"id": 13, "name": "Amazfit GTR 3", "price": 179, "category": "Smartwatch", "inStock": false, "rating": 4.0},
  {"id": 14, "name": "Huawei Watch GT 3", "price": 229, "category": "Smartwatch", "inStock": true, "rating": 4.1},
  {"id": 15, "name": "TicWatch Pro 3", "price": 299, "category": "Smartwatch", "inStock": true, "rating": 4.3},
  {"id": 16, "name": "Samsung Galaxy S20", "price": 999, "category": "Smartphone", "inStock": true, "rating": 4.5},
  {"id": 17, "name": "iPhone 13 Pro", "price": 1099, "category": "Smartphone", "inStock": false, "rating": 4.9},
  {"id": 18, "name": "Google Pixel 7", "price": 799, "category": "Smartphone", "inStock": true, "rating": 4.6},
  {"id": 19, "name": "OnePlus Nord 2", "price": 499, "category": "Smartphone", "inStock": true, "rating": 4.2},
  {"id": 20, "name": "Garmin Forerunner 245", "price": 299, "category": "Smartwatch", "inStock": true, "rating": 4.4}
]'

echo "$PRODUCTS" | jq -c '.[]' | while read product; do
  curl -X POST "$URL" \
    -H "Content-Type: application/json" \
    -d "$product"
  echo -e "\n✅ Posted: $product"
done
