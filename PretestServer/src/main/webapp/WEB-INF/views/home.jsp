<div id="ctrl-exmpl" ng-controller="SettingsController2">
  Name: <input type="text" ng-model="name"/>
  [ <a href="" ng-click="greet()">greet</a> ]<br/>
  Contact:
  <ul>
    <li ng-repeat="contact in contacts">
      <select ng-model="contact.type">
         <option>phone</option>
         <option>email</option>
      </select>
      <input type="text" ng-model="contact.value"/>
      [ <a href="" ng-click="clearContact(contact)">clear</a>
      | <a href="" ng-click="removeContact(contact)">X</a> ]
    </li>
    <li>[ <a href="" ng-click="addContact()">add</a> ]</li>
 </ul>
</div>