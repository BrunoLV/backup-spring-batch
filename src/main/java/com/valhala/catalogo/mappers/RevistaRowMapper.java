package com.valhala.catalogo.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.valhala.catalogo.modelo.Revista;

public class RevistaRowMapper implements RowMapper<Revista> {

	@Override
	public Revista mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		Revista revista = new Revista(
				resultSet.getLong("ID_REVISTA"),
				resultSet.getString("TITULO_REVISTA"),
				resultSet.getString("SUBTITULO_REVISTA"),
				resultSet.getString("ARCO_REVISTA"),
				resultSet.getShort("EDICAO_REVISTA"),
				resultSet.getShort("ANO_REVISTA"),
				resultSet.getDouble("VALOR_REVISTA"));
		return revista;
	}

}
