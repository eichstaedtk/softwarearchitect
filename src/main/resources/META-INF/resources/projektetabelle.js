class ProjekteTable extends HTMLElement {
  connectedCallback() {
    this.render();
    this.loadData();
  }

  render() {
    this.innerHTML = `<h2>Projektskizzen</h2>`;
  }

  renderData(data) {
    const dataList = document.createElement('ul');
    data.forEach(item => {
      const listItemName = document.createElement('li');
      const listItemBeschreibung = document.createElement('li');
      const listItemAuftraggeber = document.createElement('li');
      const listItemStatus = document.createElement('li');
      listItemName.textContent = 'Name: '+ item.name;
      listItemBeschreibung.textContent = 'Beschreibung: '+ item.description;
      listItemAuftraggeber.textContent = 'Auftraggeber: '+item.auftraggeber.name;
      listItemStatus.textContent =  'Status: '+item.status;
      dataList.appendChild(listItemName);
      dataList.appendChild(listItemBeschreibung);
      dataList.appendChild(listItemAuftraggeber)
      dataList.appendChild(listItemStatus)
    });

    this.appendChild(dataList);
  }

  async loadData() {
    try {
      const response = await fetch('/rest/projektskizze');
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