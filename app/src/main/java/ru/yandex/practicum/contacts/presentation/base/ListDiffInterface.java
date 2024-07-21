package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

public interface ListDiffInterface<T> {

    public boolean theSameAs(@NonNull T newItem);

    @Override
    public boolean equals(Object o);
}
