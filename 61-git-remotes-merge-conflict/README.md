# Esercizio di risoluzione di un merge conflict

**Il tempo massimo in laboratorio per questo esercizio √® di _20 minuti_.
Se superato, sospendere l'esercizio e riprenderlo per ultimo!**

Si visiti https://github.com/APICe-at-DISI/OOP-git-merge-conflict-test.
Questo repository contiene due branch: `master` e `feature`

Per ognuna delle seguenti istruzioni, si annoti l'output ottenuto.
Prima di eseguire ogni operazione sul worktree o sul repository,
si verifichi lo stato del repository con `git status`.

1. Si cloni localmente il repository
   git clone git@github.com:APICe-at-DISI/OOP-git-merge-conflict-test.git

2. Ci si assicuri di avere localmente entrambi i branch remoti
   git checkout -b feature origin/feature
   git branch

3. Si faccia il merge di `feature` dentro `master`, ossia: si posizioni la `HEAD` su `master`
   e da qui si esegua il merge di `feature`
   git merge feature
   

4. Si noti che viene generato un **merge conflict**!
5. Si risolva il merge conflict come segue:
   - Il programma Java risultante deve stampare sia il numero di processori disponibili
     (funzionalit√† presente su `master`)
     che il nome dell'autore del file
     (funzionalit√† presente su `feature`)
6. Si crei un nuovo repository nel proprio github personale
7. Si aggiunga il nuovo repository creato come **remote** e si elenchino i remote
8. Si faccia push del branch `master` sul proprio repository
9. Si setti il branch remoto `master` del nuovo repository come *upstream* per il proprio branch `master` locale

elvisperlika@MBP-Elvis lab06 % cd ..
elvisperlika@MBP-Elvis OOP % mkdir 61_git_tmp 
elvisperlika@MBP-Elvis OOP % cd 61_git_tmp 
elvisperlika@MBP-Elvis 61_git_tmp % cd ..
elvisperlika@MBP-Elvis OOP % rm -r 61_git_tmp 
elvisperlika@MBP-Elvis OOP % git clone git@github.com:APICe-at-DISI/OOP-git-merge-conflict-test.git
Cloning into 'OOP-git-merge-conflict-test'...
remote: Enumerating objects: 12, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 12 (delta 1), reused 1 (delta 1), pack-reused 8
Receiving objects: 100% (12/12), done.
Resolving deltas: 100% (2/2), done.
elvisperlika@MBP-Elvis OOP % ls
Lab                             OOP-git-merge-conflict-test     gradle-wrapper-master
MyTest                          Weeks                           lab06
elvisperlika@MBP-Elvis OOP % cd OOP-git-merge-conflict-test 
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git branch
* master
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git checkout -b feature origin/feature
branch 'feature' set up to track 'origin/feature'.
Switched to a new branch 'feature'
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git branch                            
* feature
  master
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git branch         
  feature
* master
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git checkout feature
Switched to branch 'feature'
Your branch is up to date with 'origin/feature'.
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git checkout master 
Switched to branch 'master'
Your branch is up to date with 'origin/master'.
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git merge feature
Auto-merging HelloWorld.java
CONFLICT (content): Merge conflict in HelloWorld.java
Automatic merge failed; fix conflicts and then commit the result.
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % 
 *  Cronologia ripristinata 

elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git merge feature
error: Merging is not possible because you have unmerged files.
hint: Fix them up in the work tree, and then use 'git add/rm <file>'
hint: as appropriate to mark resolution and make a commit.
fatal: Exiting because of an unresolved conflict.
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git log --oneline                       
8e0f29c (HEAD -> master, origin/master, origin/HEAD) Change HelloWorld to print the number of available processors
d956df6 Create .gitignore
700ee0b Create HelloWorld
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git add HelloWorld.java 
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git commit -m 'Resolve conflict and now print Author and Processors'
[master 83a0a8e] Resolve conflict and now print Author and Processors
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git log --oneline                                                   
83a0a8e (HEAD -> master) Resolve conflict and now print Author and Processors
bed943f (origin/feature, feature) Print author information
8e0f29c (origin/master, origin/HEAD) Change HelloWorld to print the number of available processors
d956df6 Create .gitignore
700ee0b Create HelloWorld
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git log --graph         
*   commit 83a0a8e695f001647b10925e3d1d682aaf57a28d (HEAD -> master)
|\  Merge: 8e0f29c bed943f
| | Author: Elvis Perlika <elvis>
| | Date:   Mon Oct 24 11:19:51 2022 +0200
| | 
| |     Resolve conflict and now print Author and Processors
| | 
| * commit bed943fbdd6ba94e64197448e4754a529d984e88 (origin/feature, feature)
| | Author: Danilo Pianini <danilo.pianini@gmail.com>
| | Date:   Thu Oct 27 17:21:22 2016 +0200
| | 
| |     Print author information
:...skipping...
*   commit 83a0a8e695f001647b10925e3d1d682aaf57a28d (HEAD -> master)
|\  Merge: 8e0f29c bed943f
| | Author: Elvis Perlika <elvis>
| | Date:   Mon Oct 24 11:19:51 2022 +0200
| | 
| |     Resolve conflict and now print Author and Processors
| | 
| * commit bed943fbdd6ba94e64197448e4754a529d984e88 (origin/feature, feature)
| | Author: Danilo Pianini <danilo.pianini@gmail.com>
| | Date:   Thu Oct 27 17:21:22 2016 +0200
| | 
| |     Print author information
| | 
* | commit 8e0f29c12e060f3bdc62540343eff3e473616d61 (origin/master, origin/HEAD)
|/  Author: Danilo Pianini <danilo.pianini@gmail.com>
|   Date:   Thu Oct 27 17:19:05 2016 +0200
|   
|       Change HelloWorld to print the number of available processors
| 
:...skipping...
*   commit 83a0a8e695f001647b10925e3d1d682aaf57a28d (HEAD -> master)
|\  Merge: 8e0f29c bed943f
| | Author: Elvis Perlika <elvis>
| | Date:   Mon Oct 24 11:19:51 2022 +0200
| | 
| |     Resolve conflict and now print Author and Processors
| | 
| * commit bed943fbdd6ba94e64197448e4754a529d984e88 (origin/feature, feature)
| | Author: Danilo Pianini <danilo.pianini@gmail.com>
| | Date:   Thu Oct 27 17:21:22 2016 +0200
| | 
| |     Print author information
| | 
* | commit 8e0f29c12e060f3bdc62540343eff3e473616d61 (origin/master, origin/HEAD)
|/  Author: Danilo Pianini <danilo.pianini@gmail.com>
|   Date:   Thu Oct 27 17:19:05 2016 +0200
|   
|       Change HelloWorld to print the number of available processors
| 
* commit d956df66aeb0829f23b7b3d0d9a1c002c390f87f
| Author: Danilo Pianini <danilo.pianini@gmail.com>
| Date:   Thu Oct 27 17:17:43 2016 +0200
| 
|     Create .gitignore
| 
* commit 700ee0b669f6cd75384abb9af51ca5c2adefe917
  Author: Danilo Pianini <danilo.pianini@gmail.com>
  Date:   Thu Oct 27 17:15:10 2016 +0200
  
      Create HelloWorld
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git log --graph
*   commit 83a0a8e695f001647b10925e3d1d682aaf57a28d (HEAD -> master)
|\  Merge: 8e0f29c bed943f
| | Author: Elvis Perlika <elvis>
| | Date:   Mon Oct 24 11:19:51 2022 +0200
| | 
| |     Resolve conflict and now print Author and Processors
*   commit 83a0a8e695f001647b10925e3d1d682aaf57a28d (HEAD -> master)
|\  Merge: 8e0f29c bed943f
| | Author: Elvis Perlika <elvis>
| | Date:   Mon Oct 24 11:19:51 2022 +0200
| | 
| |     Resolve conflict and now print Author and Processors
| | 
| * commit bed943fbdd6ba94e64197448e4754a529d984e88 (origin/feature, feature)
| | Author: Danilo Pianini <danilo.pianini@gmail.com>
| | Date:   Thu Oct 27 17:21:22 2016 +0200
*   commit 83a0a8e695f001647b10925e3d1d682aaf57a28d (HEAD -> master)
|\  Merge: 8e0f29c bed943f
| | Author: Elvis Perlika <elvis>
| | Date:   Mon Oct 24 11:19:51 2022 +0200
| | 
| |     Resolve conflict and now print Author and Processors
| | 
| * commit bed943fbdd6ba94e64197448e4754a529d984e88 (origin/feature, feature)
| | Author: Danilo Pianini <danilo.pianini@gmail.com>
| | Date:   Thu Oct 27 17:21:22 2016 +0200
| | 
| |     Print author information
| | 
* | commit 8e0f29c12e060f3bdc62540343eff3e473616d61 (origin/master, origin/HEAD)
|/  Author: Danilo Pianini <danilo.pianini@gmail.com>
|   Date:   Thu Oct 27 17:19:05 2016 +0200
|   
|       Change HelloWorld to print the number of available processors
| 
* commit d956df66aeb0829f23b7b3d0d9a1c002c390f87f
| Author: Danilo Pianini <danilo.pianini@gmail.com>
| Date:   Thu Oct 27 17:17:43 2016 +0200
| 
|     Create .gitignore
| 
* commit 700ee0b669f6cd75384abb9af51ca5c2adefe917
  Author: Danilo Pianini <danilo.pianini@gmail.com>
  Date:   Thu Oct 27 17:15:10 2016 +0200
  
      Create HelloWorld
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % cd ..
elvisperlika@MBP-Elvis OOP % git remote add myRepo 
fatal: not a git repository (or any of the parent directories): .git
elvisperlika@MBP-Elvis OOP % git remote add myRepo git@github.com:elvisperlika/OOP-git-merge-conflict-test.git
fatal: not a git repository (or any of the parent directories): .git
elvisperlika@MBP-Elvis OOP % git remote add myRepo git@github.com:elvisperlika/OOP-git-merge-conflict-test.git
fatal: not a git repository (or any of the parent directories): .git
elvisperlika@MBP-Elvis OOP % cd OOP-git-merge-conflict-test 
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git remote add myRepo git@github.com:elvisperlika/OOP-git-merge-conflict-test.git
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git branch                                                       
  feature
* master
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % git push myRepo master
Enumerating objects: 15, done.
Counting objects: 100% (15/15), done.
Delta compression using up to 4 threads
Compressing objects: 100% (11/11), done.
Writing objects: 100% (15/15), 1.57 KiB | 1.57 MiB/s, done.
Total 15 (delta 4), reused 10 (delta 2), pack-reused 0
remote: Resolving deltas: 100% (4/4), done.
To github.com:elvisperlika/OOP-git-merge-conflict-test.git
 * [new branch]      master -> master
elvisperlika@MBP-Elvis OOP-git-merge-conflict-test % cd ../lab06 
elvisperlika@MBP-Elvis lab06 % ls
61-git-remotes-merge-conflict   63-exceptions                   65-implement-generic-class
62-use-lists-and-maps           64-design-with-maps             README.md
elvisperlika@MBP-Elvis lab06 % tree
.
‚Ēú‚ĒÄ‚ĒÄ 61-git-remotes-merge-conflict
‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ README.md
‚Ēú‚ĒÄ‚ĒÄ 62-use-lists-and-maps
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ README.md
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ bin
‚Ēā   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ main
‚Ēā   ‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ it
‚Ēā   ‚Ēā           ‚ĒĒ‚ĒÄ‚ĒÄ unibo
‚Ēā   ‚Ēā               ‚ĒĒ‚ĒÄ‚ĒÄ collections
‚Ēā   ‚Ēā                   ‚Ēú‚ĒÄ‚ĒÄ TestPerformance.class
‚Ēā   ‚Ēā                   ‚ĒĒ‚ĒÄ‚ĒÄ UseListsAndMaps.class
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ build.gradle.kts
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradle
‚Ēā   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ wrapper
‚Ēā   ‚Ēā       ‚Ēú‚ĒÄ‚ĒÄ gradle-wrapper.jar
‚Ēā   ‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ gradle-wrapper.properties
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradlew
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradlew.bat
‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ src
‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ main
‚Ēā           ‚ĒĒ‚ĒÄ‚ĒÄ java
‚Ēā               ‚ĒĒ‚ĒÄ‚ĒÄ it
‚Ēā                   ‚ĒĒ‚ĒÄ‚ĒÄ unibo
‚Ēā                       ‚ĒĒ‚ĒÄ‚ĒÄ collections
‚Ēā                           ‚Ēú‚ĒÄ‚ĒÄ TestPerformance.java
‚Ēā                           ‚ĒĒ‚ĒÄ‚ĒÄ UseListsAndMaps.java
‚Ēú‚ĒÄ‚ĒÄ 63-exceptions
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ README.md
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ bin
‚Ēā   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ main
‚Ēā   ‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ it
‚Ēā   ‚Ēā           ‚ĒĒ‚ĒÄ‚ĒÄ unibo
‚Ēā   ‚Ēā               ‚ĒĒ‚ĒÄ‚ĒÄ exceptions
‚Ēā   ‚Ēā                   ‚Ēú‚ĒÄ‚ĒÄ UseArithmeticService.class
‚Ēā   ‚Ēā                   ‚Ēú‚ĒÄ‚ĒÄ arithmetic
‚Ēā   ‚Ēā                   ‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ ArithmeticService.class
‚Ēā   ‚Ēā                   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ ArithmeticUtil.class
‚Ēā   ‚Ēā                   ‚ĒĒ‚ĒÄ‚ĒÄ fakenetwork
‚Ēā   ‚Ēā                       ‚Ēú‚ĒÄ‚ĒÄ api
‚Ēā   ‚Ēā                       ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ NetworkComponent.class
‚Ēā   ‚Ēā                       ‚ĒĒ‚ĒÄ‚ĒÄ impl
‚Ēā   ‚Ēā                           ‚ĒĒ‚ĒÄ‚ĒÄ ServiceBehindUnstableNetwork.class
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ build
‚Ēā   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ javaqa
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ build.gradle.kts
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradle
‚Ēā   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ wrapper
‚Ēā   ‚Ēā       ‚Ēú‚ĒÄ‚ĒÄ gradle-wrapper.jar
‚Ēā   ‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ gradle-wrapper.properties
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradlew
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradlew.bat
‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ src
‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ main
‚Ēā           ‚ĒĒ‚ĒÄ‚ĒÄ java
‚Ēā               ‚ĒĒ‚ĒÄ‚ĒÄ it
‚Ēā                   ‚ĒĒ‚ĒÄ‚ĒÄ unibo
‚Ēā                       ‚ĒĒ‚ĒÄ‚ĒÄ exceptions
‚Ēā                           ‚Ēú‚ĒÄ‚ĒÄ UseArithmeticService.java
‚Ēā                           ‚Ēú‚ĒÄ‚ĒÄ arithmetic
‚Ēā                           ‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ ArithmeticService.java
‚Ēā                           ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ ArithmeticUtil.java
‚Ēā                           ‚ĒĒ‚ĒÄ‚ĒÄ fakenetwork
‚Ēā                               ‚Ēú‚ĒÄ‚ĒÄ api
‚Ēā                               ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ NetworkComponent.java
‚Ēā                               ‚ĒĒ‚ĒÄ‚ĒÄ impl
‚Ēā                                   ‚ĒĒ‚ĒÄ‚ĒÄ ServiceBehindUnstableNetwork.java
‚Ēú‚ĒÄ‚ĒÄ 64-design-with-maps
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ README.md
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ bin
‚Ēā   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ main
‚Ēā   ‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ it
‚Ēā   ‚Ēā           ‚ĒĒ‚ĒÄ‚ĒÄ unibo
‚Ēā   ‚Ēā               ‚ĒĒ‚ĒÄ‚ĒÄ collections
‚Ēā   ‚Ēā                   ‚ĒĒ‚ĒÄ‚ĒÄ social
‚Ēā   ‚Ēā                       ‚Ēú‚ĒÄ‚ĒÄ TestSocialNetworkUser.class
‚Ēā   ‚Ēā                       ‚Ēú‚ĒÄ‚ĒÄ api
‚Ēā   ‚Ēā                       ‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ SocialNetworkUser.class
‚Ēā   ‚Ēā                       ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ User.class
‚Ēā   ‚Ēā                       ‚ĒĒ‚ĒÄ‚ĒÄ impl
‚Ēā   ‚Ēā                           ‚Ēú‚ĒÄ‚ĒÄ SocialNetworkUserImpl.class
‚Ēā   ‚Ēā                           ‚ĒĒ‚ĒÄ‚ĒÄ UserImpl.class
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ build.gradle.kts
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradle
‚Ēā   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ wrapper
‚Ēā   ‚Ēā       ‚Ēú‚ĒÄ‚ĒÄ gradle-wrapper.jar
‚Ēā   ‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ gradle-wrapper.properties
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradlew
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ gradlew.bat
‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ src
‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ main
‚Ēā           ‚ĒĒ‚ĒÄ‚ĒÄ java
‚Ēā               ‚ĒĒ‚ĒÄ‚ĒÄ it
‚Ēā                   ‚ĒĒ‚ĒÄ‚ĒÄ unibo
‚Ēā                       ‚ĒĒ‚ĒÄ‚ĒÄ collections
‚Ēā                           ‚ĒĒ‚ĒÄ‚ĒÄ social
‚Ēā                               ‚Ēú‚ĒÄ‚ĒÄ TestSocialNetworkUser.java
‚Ēā                               ‚Ēú‚ĒÄ‚ĒÄ api
‚Ēā                               ‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ SocialNetworkUser.java
‚Ēā                               ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ User.java
‚Ēā                               ‚ĒĒ‚ĒÄ‚ĒÄ impl
‚Ēā                                   ‚Ēú‚ĒÄ‚ĒÄ SocialNetworkUserImpl.java
‚Ēā                                   ‚ĒĒ‚ĒÄ‚ĒÄ UserImpl.java
‚Ēú‚ĒÄ‚ĒÄ 65-implement-generic-class
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ README.md
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ bin
‚Ēā   ‚Ēā   ‚ĒĒ‚ĒÄ‚ĒÄ main
‚Ēā   ‚Ēā       ‚ĒĒ‚ĒÄ‚ĒÄ it
‚Ēā   ‚Ēā           ‚ĒĒ‚ĒÄ‚ĒÄ unibo
‚Ēā   ‚Ēā               ‚ĒĒ‚ĒÄ‚ĒÄ generics
‚Ēā   ‚Ēā                   ‚ĒĒ‚ĒÄ‚ĒÄ graph
‚Ēā   ‚Ēā                       ‚Ēú‚ĒÄ‚ĒÄ UseGraph.class
‚Ēā   ‚Ēā                       ‚ĒĒ‚ĒÄ‚ĒÄ api
‚Ēā   ‚Ēā                           ‚ĒĒ‚ĒÄ‚ĒÄ Graph.class
‚Ēā   ‚Ēú‚ĒÄ‚ĒÄ build.gradle.kts
elvisperlika@MBP-Elvis lab06 % 
