package org.yaroslav.domain.repositories;

import org.yaroslav.domain.entities.User;
import java.util.Collection;

public interface UserRepository {
	/**
	 * Создаёт пользователя.
	 *
	 * @param name Имя пользователя.
	 * @param email Электронная почта пользователя
	 * @param password Пароль пользователя.
	 * @param image Изображение пользователя.
	 * @param role Роль пользователя.
	 * @return Созданный пользователь.
	 */
	User create(
			String name,
			String email,
			String password,
			String image,
			User.Role role
	);

	/**
	 * Обновляет данные пользователя.
	 *
	 * @param id Идентификатор пользователя.
	 * @param name Имя пользователя.
	 * @param email Электронная почта пользователя.
	 * @param password Пароль пользователя.
	 * @param image Изображение пользователя.
	 * @param role Роль пользователя.
	 * @return Обновлённый пользователь.
	 */
	User update(
			long id,
			String name,
			String email,
			String password,
			String image,
			User.Role role
	);

	/**
	 * Удаляет пользователя.
	 *
	 * @param id Идентификатор пользователя.
	 */
	void delete(long id);

	/**
	 * Получает пользователя по его идентификатору.
	 *
	 * @param id Идентификатор пользователя.
	 * @return Пользователь с запрошенным идентификатором.
	 */
	User get(long id);

	/**
	 * Получает пользователя по его электронной почте.
	 *
	 * @param email Электронная почта пользователя.
	 * @return Пользователь с запрошенной электронной почтой.
	 */
	User get(String email);

	/**
	 * Получает список всех пользователей.
	 *
	 * @return Список всех пользователей.
	 */
	Collection<User> getAll();

	/**
	 * Проверяет, существует ли пользователь с указанным идентификатором.
	 *
	 * @param id Идентификатор пользователя.
	 * @return Результат проверки.
	 */
	boolean exists(long id);

	/**
	 * Проверяет, существует ли пользователь с указанной электронной почтой.
	 *
	 * @param email Электронная почта пользователя.
	 * @return Результат проверки.
	 */
	boolean exists(String email);
}
