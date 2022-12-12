<h1>DLS Android sample project</h1>

This project shows the integration of the library that contains the DLS within the project and its use.

<h3>Recommendations:</h3>
<ul>
<li>Associate source code repository before downloading the app from VCS option:</li>
<ul>
<li>Enable Version Control Integration</li>
</ul>
<li>If you do not have a physical device, you can configure a virtual device that supports at least API 30 or higher.</li>

<li>Consider having the latest Android Studio update</li>
</ul>

<h3>Software installation</h3>
<ol>
<li>Download the repository project</li>
<li>Perform sync via Gradle (may take several minutes)</li>
<li>Add the library dependency in the Gradle file (app):</li>
              implementation files('../libs/library.aar')
<li>Once this action is done, it is necessary to syncronized the project again.</li>
<li>Run the project with either a physical or virtual device</li>
</ol>

NOTE: Every time the library is updated, it is required to update the file in the indicated path to obtain the new changes.
