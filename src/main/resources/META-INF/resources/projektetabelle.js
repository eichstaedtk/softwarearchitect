class ProjekteTable extends HTMLElement {
  connectedCallback() {
    this.render();
    this.loadData();
  }

  render() {
    this.innerHTML = `<h2>Projekte</h2>`;
  }

  renderData(data) {
    const dataList = document.createElement('ul');
    data.forEach(item => {
      const listItem = document.createElement('li');
      listItem.textContent = 'Name: '+ item.name+ ', Beschreibung: '+ item.description+', Auftraggeber: '+item.auftraggeber.name+'  Status: '+item.status;
      dataList.appendChild(listItem);
    });

    this.appendChild(dataList);
  }

  async loadData() {
    try {
      const response = await fetch('/rest/projektskizzen');
      if (response.ok) {
        const data = await response.json();
        console.log('Geladene Daten:', data);
        this.renderData(data)

      } else {
        console.error('Fehler beim Laden der Daten:', response.status);
      }
    } catch (error) {
      console.error('Fehler beim Laden der Daten:', error);
    }
  }
}

customElements.define('th-projekte', ProjekteTable);