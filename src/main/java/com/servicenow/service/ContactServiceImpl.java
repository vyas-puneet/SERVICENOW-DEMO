package com.servicenow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.servicenow.dto.ContactDTO;
import com.servicenow.dto.ContactTriggerDTO;
import com.servicenow.repository.ContactRepository;

@Service
@Transactional
public class ContactServiceImpl implements ContactServiceInt {

	@Autowired
	ContactRepository contactRepository;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public ContactDTO add(ContactDTO contactDTO) {
		return contactRepository.save(contactDTO);
	}

	@Override
	public void delete(Long id) {
		contactRepository.deleteById(id);
	}

	@Override
	public List<ContactDTO> list() {
		return contactRepository.findAll();
	}

	@Override
	public ContactDTO getById(Long id) {
		return contactRepository.getById(id);
	}

	@Override
	public List<ContactTriggerDTO> readDataSql() {

		List<ContactTriggerDTO> contactList = jdbcTemplate.query("select * from contact_stage",
				new BeanPropertyRowMapper(ContactTriggerDTO.class));
		return contactList;
	}

	@Override
	public void clearTriggerData(long id) {
		String sql = "DELETE FROM contact_stage WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

}
