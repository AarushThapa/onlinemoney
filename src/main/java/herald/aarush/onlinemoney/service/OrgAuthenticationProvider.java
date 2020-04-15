package herald.aarush.onlinemoney.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import herald.aarush.onlinemoney.dao.OrgDao;
import herald.aarush.onlinemoney.entities.EOrganization;

@Service("customloginprovider")
@Transactional(readOnly = true)
public class OrgAuthenticationProvider implements UserDetailsService {

	@Autowired
	private OrgDao orgdaoimpl;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			EOrganization domainUser = orgdaoimpl.getOrganization(username);
			boolean enabled = true;
			boolean accountNonExpired = true;
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = true;
			
			return new User(
					domainUser.getOrg_name(), 
					domainUser.getOrg_pw(),
					enabled,
					accountNonExpired,
					credentialsNonExpired,
					accountNonLocked,
					getAuthorities(domainUser.getRole()));
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}}
		
		public Collection<? extends GrantedAuthority> getAuthorities(Integer role) {
			List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
			return authList;
		}
		
		public List<String> getRoles(Integer role) {
			List<String> roles = new ArrayList<String>();
			
			if (role.intValue() == 1) {
				//roles.add("ROLE_USER");
				roles.add("ROLE_ADMIN");
				
			} else if (role.intValue() == 2) {
				roles.add("ROLE_USER");
			}
			
			return roles;
		}
		
		
		public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			for (String role : roles) {
				authorities.add(new SimpleGrantedAuthority(role));
			}
			return authorities;
		}
	
	}
	

	
