package com.gitupscale.jpa.common;

import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 * @author Noelson
 *
 */
@MappedSuperclass
public class Federation<FedRel extends FederationRelationship<?>> extends BaseEntity<String, Federation<FedRel>> {

	private static final long serialVersionUID = -6816306010134806015L;

	private String name;
	
	/**
	 * This is the type of the federation which can be Fokontany, Faritra, etc ...
	 * Use the FederationType enum if applicable
	 * for all comparison etc...
	 * */
	private String federationType;

	private int weight;

	@OneToMany
	private Set<FedRel> relations;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Set<FedRel> getRelations() {
		return relations;
	}

	public void setRelations(Set<FedRel> relations) {
		this.relations = relations;
	}

	public Federation<?> getPlusOne() {
		return this.getRelations().stream().filter(fed -> fed.getParent().getWeight() - 1 == this.getWeight())
				.collect(Collectors.toList()).get(0).getParent();
	}

	public Federation<?> getMinusOne() {
		return this.getRelations().stream().filter(fed -> fed.getChild().getWeight() + 1 == this.getWeight())
				.collect(Collectors.toList()).get(0).getChild();
	}

	@Override
	public boolean equals(Object obj) {

		return (obj instanceof Federation) && (((Federation<?>)obj).getWeight()==this.getWeight()) && (((Federation<?>)obj).getName()==this.getName());
	}

	public String getFederationType() {
		return federationType;
	}

	public void setFederationType(String federationType) {
		this.federationType = federationType;
	}
}
